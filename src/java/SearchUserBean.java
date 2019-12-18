
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="searchUserBean")
public class SearchUserBean {

    List<User> userList;
    String emailInput;
    String cityInput;
    String fnameInput;
    String userNameInput;

    public String getfnameInput() {
        return fnameInput;
    }

    public void setfnameInput(String fnameInput) {
        this.fnameInput = fnameInput;
    }
    
    

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }


    public String getCityInput() {
        return cityInput;
    }

    public void setCityInput(String cityInput) {
        this.cityInput = cityInput;
    }

    public String getUserNameInput() {
        return userNameInput;
    }

    public void setUserNameInput(String userNameInput) {
        this.userNameInput = userNameInput;
    }
    
    
    public void search(){
        
        JDBCLayer myJDBC = new JDBCLayer();
        userList = myJDBC.GetAllUsers(userNameInput,cityInput);
//        if(fNameInput.equals("")&& cityInput.equals(""))
//            return;
//        
//        userList = this.createUserList();
//        
//        List<User> matchedUser = new ArrayList<User>();
//        
//        for(User u:userList){
//            if((u.fName.toLowerCase().contains(fNameInput.toLowerCase()))&&(u.city.toLowerCase().contains(cityInput.toLowerCase()))){
//                matchedUser.add(u);
//            }
//        }
//        
//        userList = matchedUser;
                
    }
    
    public void Delete(String email){
        
        User u = userList.stream()
                .filter(x ->x.email.equals(email))
                .findFirst()
                .get();
        userList.remove(u);
    }
    
    public List<User> createUserList(){
        List<User> hardCodedUserList = new ArrayList<User>();
        
//        Address bobAddress = new Address("5800 Bay Area Blvd.", "TX", "USA","ClearLake" ,"77058");
//        Address aliceAddress = new Address("800 Bay Area Blvd.", "TX", "USA","Bay Area", "77062");
//        Address johnAddress = new Address("5600 Space Center Blvd","TX","USA","Space City","77062");
//        Address john2Address = new Address("5009 Bay City","TX","USA","ClearLake","77058");
        
//        User user1 = new User("Yes", "Drew", "Girton", "11-07-1992", "drew@email.com","Pasadena", "TX", "77504", 
//            "USA","12345", "US Navy","Electrician", "Fixed Things", "06-22-2012", "06-22-2016",
//            "UHCL", "MIS", "01-15-2016", "01-15-2019");
//        
//        User user2 = new User("Yes", "John", "Girton", "02-22-1989", "john@email.com","Houston", "TX", "77571", 
//            "USA","12345", "US Army","Captain", "Blew stuff up", "06-22-2011", "12-2-2018",
//            "SHSU", "Criminal Justice", "01-15-2008", "01-15-2012");
        
//        User user1 = new User("bobBond", "123", bobAddress, "281-289-0000", 
//                "bob@uhcl.edu", "bob", "Bond", new Date(1961, 12,12) , "Male");
//        User user2 = new User("Alice", "123", aliceAddress, "281-289-01234", 
//                "alice@uhcl.edu", "Alice", "Bond", new Date(1990, 12,12) , "Female");
//        User user3 = new User("John123","123",johnAddress,"281-458-0000","johndoe@UHCL.edu","John","Doe",new Date(1994,12,4),"Male");
//        User user4 = new User("john567", "123", john2Address, "281-289-0000", 
//                "john2@uhcl.edu", "John", "Doe", new Date(1961, 12,12) , "Male");
        
//        hardCodedUserList.add(user1);
//        hardCodedUserList.add(user2);
//         hardCodedUserList.add(user3);
//         hardCodedUserList.add(user4);
        return hardCodedUserList;
    }

    public SearchUserBean() {
//        userList = createUserList();
        this.userNameInput ="";
        this.cityInput ="";
    }
    
}
