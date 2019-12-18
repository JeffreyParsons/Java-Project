
public class User {
    String admin;
    String userId;
    String fname;
    String lname;
    String DOB;
    String email;
    String city;
    String state;
    String zip;
    String country;
    String password;
    
    //employer information
    String employer;
    String title;
    String description;
    String jobStart;
    String jobEnd; 
    
    //education information
    String school;
    String major;
    String schoolStart;
    String schoolEnd;
    
    
    public User (String admin, String fname, String lname, String DOB, String email,String city, String state, String zip, 
            String country,String password, String employer,String title, String description, String jobStart, String jobEnd,
            String school, String major, String schoolStart, String schoolEnd){
        this.admin = admin;
        this.lname = lname;
        this.fname =fname;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.password = password;
        
        this.employer = employer;
        this.title = title;
        this.description = description;
        this.jobStart = jobStart;
        this.jobEnd = jobEnd;
        this.school = school;
        this.major = major;
        this.schoolStart = schoolStart;
        this.schoolEnd = schoolEnd;
        
        
        
    }

//    public User(String admin, String userId, String fName, String lName, String DOB, String email, String city, String state, String zip, String country, String password, String employer, String title, String description, String jobStart, String jobEnd, String school, String major, String schoolStart, String schoolEnd) {
//        this.admin = admin;
//        this.userId = userId;
//        this.fName = fName;
//        this.lName = lName;
//        this.DOB = DOB;
//        this.email = email;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.country = country;
//        this.password = password;
//        this.employer = employer;
//        this.title = title;
//        this.description = description;
//        this.jobStart = jobStart;
//        this.jobEnd = jobEnd;
//        this.school = school;
//        this.major = major;
//        this.schoolStart = schoolStart;
//        this.schoolEnd = schoolEnd;
//    }
    
    

    public User(String fname, String lName) {
        this.fname = fname;
        this.lname = lName;
    }

    public User(String userId, String fname, String lName, String email, String city) {
        this.userId = userId;
        this.fname = fname;
        this.lname = lName;
        this.email = email;
        this.city = city;
    }
    
    
    
    public User() {
    }

    

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
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

    

    
    
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
