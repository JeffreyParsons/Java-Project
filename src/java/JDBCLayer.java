
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintViolationException;

public class JDBCLayer {
    
    final String DATABASE_URL = "jdbc:mysql://mis-sql.uhcl.edu:3306/gilj4664"; 
    final String username = "gilj4664";
    final String pwd = "1792509";
    
    public void LoadMyJDBCDriver() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC Driver is ok");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }  
    }
    
    public String InsertAUser(User myUser){
        
        this.LoadMyJDBCDriver();
        
        String SQLErrorMsg = ""; //empty
        String isAdmin;
        if(myUser.getAdmin().toLowerCase().equals("yes"))
            isAdmin = "Yes";
        else
            isAdmin="No";
        
        String insertString = "insert into user ";
        insertString += "VALUES(" + "DEFAULT,'"
                + isAdmin + "','"
                + myUser.getLname() + "','"
                + myUser.getFname() + "','"
                + myUser.getEmail() + "','"
                + myUser.getDOB() + "','"
                + myUser.getEmployer() + "','"
                + myUser.getTitle() + "','"
                + myUser.getDescription() + "','"
                + myUser.getJobStart() + "','"
                + myUser.getJobEnd() + "','"
                + myUser.getCity() + "','"
                + myUser.getState() + "','"
                + myUser.getZip() + "','"
                + myUser.getCountry() + "','"
                + myUser.getMajor() + "','"
                + myUser.getSchool() + "','"
                + myUser.getJobStart() + "','"
                + myUser.getJobEnd() + "')";
               
        
//        String insertString = "insert into persons_0000 (FirstName, LastName, Email, City)";
//        insertString += "VALUES('" + myUser.getfName() +"','"
//                + myUser.getLastName() +"','"
//                +myUser.getEmail() +"','"
//                +myUser.getHomeAddress().getCity()
//                +"')";
                
        try{
            //get database connection
            Connection c = DriverManager.getConnection(this.DATABASE_URL, this.username, this.pwd);
            //create sql statement
            Statement s = c.createStatement();
            s.executeUpdate(insertString);
        }
        catch(ConstraintViolationException e)
        {
            SQLErrorMsg = e.getMessage();
        }
        catch(SQLException e)
        {
            SQLErrorMsg = e.getMessage();
        }
        return SQLErrorMsg;
    }
    
    public User GetUsersInfo(String email){     // Called in UserDisplayBean
                                                // Use Email to search Database
        this.LoadMyJDBCDriver();
        
        User u = new User();
        
        try{
            Connection c = DriverManager.getConnection(this.DATABASE_URL, this.username, this.pwd);
            Statement stmt = c.createStatement();
            
            String queryString;
            
            queryString = "SELECT FirstName, LastName, Email, Employer, JobTitle, JobStart, "
                    + "JobEnd, School, Major, EStart, EEnd "
                    + "FROM user WHERE Email = '" + email + "'";            
                
            ResultSet rs = stmt.executeQuery(queryString);  
            
            while(rs.next())
            {
                u.setFname(rs.getString("FirstName") );
                u.setLname( rs.getString("LastName") );
                u.setEmail( rs.getString("Email") );
                u.setEmployer( rs.getString("Employer") );
                u.setTitle( rs.getString("JobTitle") );
                u.setJobStart( rs.getString("JobStart") );
                u.setJobEnd( rs.getString("JobEnd") );
                u.setSchool( rs.getString("School") );
                u.setMajor( rs.getString("Major") );
                u.setSchoolStart( rs.getString("EStart") );
                u.setSchoolEnd( rs.getString("EEnd") );
                 
            }
            
        }
        catch(SQLException e){
             String SQLErrorMsg = e.getMessage();
        }
        
       return u;
       
    }
    
    
    
    // Retrieve List of Users that are NOT the viewed Profile
    
    public List<User> GetFriends(String email) {    // Called in UserDisplayBean
                                                    // Use Email to search Database
        this.LoadMyJDBCDriver();
        
        List<User> userList = new ArrayList<User>();
        
        try{
            Connection c = DriverManager.getConnection(this.DATABASE_URL,
                    this.username,this.pwd );
            Statement stmt = c.createStatement();
            
            String queryString;
            
            queryString = "Select FirstName, LastName FROM users "
                    + "WHERE Email != '" + email + "'";            
                
            ResultSet rs = stmt.executeQuery(queryString);                   
            
             while(rs.next())
            {
                User newUser = new User(
                        rs.getString("FirstName"),
                        rs.getString("LastName")
                );
                
                userList.add(newUser);
            }
            
        }
        catch(SQLException e){
             String SQLErrorMsg = e.getMessage();
        }
        
        return userList;
    }
    
    public List<User> GetAllUsers(String userNameSearchTerm,String citySearchTerm){
           
        this.LoadMyJDBCDriver();
        
        List<User> userList = new ArrayList<User>();
        
        try{
            Connection c = DriverManager.getConnection(this.DATABASE_URL,
                    this.username,this.pwd );
            Statement stmt = c.createStatement();
            
            String queryString;
            
            if(userNameSearchTerm.equals("")&& citySearchTerm.equals(""))
                queryString = "SELECT * FROM user";
            else{
                queryString = "SELECT * FROM user where";
                
                if(!citySearchTerm.equals("") && !userNameSearchTerm.equals(""))
                    queryString += " user.email like '%" + userNameSearchTerm + "%' and user.city like '%"+ citySearchTerm + " %'";
                else if(!userNameSearchTerm.equals(""))
                   queryString += " user.email like '%" + userNameSearchTerm + "%'";
                else
                    queryString += " user.city like '%" + citySearchTerm + "%'";
                     
            }                          
                
            ResultSet rs = stmt.executeQuery(queryString);                   
            
            while(rs.next()){
                
           
                User newUser = new User(
                        
                        rs.getString("UserID"),               
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("Email"),
                        rs.getString("City")
                                               
                        );
                
                userList.add(newUser);
            }
            
        }
        catch(SQLException e){
             String SQLErrorMsg = e.getMessage();
        }
        
        return userList;
    }
}
