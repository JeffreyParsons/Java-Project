
import java.util.List;
import javax.faces.bean.ManagedBean;




@ManagedBean(name="userDisplayBean")
public class UserDisplayBean {
    
    // User List for Friends/Connections
    
    List<User> userList;
    
    // Name attributes
    
    String fname;
    String lname;
    String email;    
    
    // Work attributes  
    
    String employer;
    String title;
    String jobStart;
    String jobEnd;
    
    // Education attributes
    
    String school;
    String major;
    String schoolStart;
    String schoolEnd;
    
    
    
    // Assigns info retrieved from JDBC Layer/Database 

    public UserDisplayBean() {
        
        JDBCLayer myJDBC = new JDBCLayer();
        User user = myJDBC.GetUsersInfo("Ross@email.com"); // Requires Email to search
       
        fname = user.fname;
        lname= user.lname;
        
        employer = user.employer;
        title = user.title;
        jobStart = user.jobStart;
        jobEnd = user.jobEnd;
        
        school = user.school;
        major = user.major;
        schoolStart = user.schoolStart;
        schoolEnd = user.schoolEnd;
        
    }
    
    
    // Display List of other Users
    
    public void showFriends() {
        
        JDBCLayer myJDBC = new JDBCLayer();
        userList = myJDBC.GetFriends("jeff@uhcl.edu");  // Requires Email to Search
        
    }
    
    
    // Getters && Setters

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobStart() {
        return jobStart;
    }

    public void setJobStart(String jobStart) {
        this.jobStart = jobStart;
    }

    public String getJobEnd() {
        return jobEnd;
    }

    public void setJobEnd(String jobEnd) {
        this.jobEnd = jobEnd;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolStart() {
        return schoolStart;
    }

    public void setSchoolStart(String schoolStart) {
        this.schoolStart = schoolStart;
    }

    public String getSchoolEnd() {
        return schoolEnd;
    }

    public void setSchoolEnd(String schoolEnd) {
        this.schoolEnd = schoolEnd;
    }
    

 
}