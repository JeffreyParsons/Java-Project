import javax.faces.bean.ManagedBean;

@ManagedBean(name="validationBean")
public class ValidationBean {
    //user information
    String admin;
    String email;
    String fname;
    String lname;
    String DOB;
    String city;
    String state;
    String zip;
    String country;
    String password;
    
    //employer information
    String employer;
    String title; //job title
    String description; //job description
    String JobStart; //start date
    String JobEnd; //end date
    
    //education information
    String SchoolName;
    String Major;
    String SchoolStart;
    String SchoolEnd;
    
    //getter and setter

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

    

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
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
        return JobStart;
    }

    public void setJobStart(String JobStart) {
        this.JobStart = JobStart;
    }

    public String getJobEnd() {
        return JobEnd;
    }

    public void setJobEnd(String JobEnd) {
        this.JobEnd = JobEnd;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getSchoolStart() {
        return SchoolStart;
    }

    public void setSchoolStart(String SchoolStart) {
        this.SchoolStart = SchoolStart;
    }

    public String getSchoolEnd() {
        return SchoolEnd;
    }

    public void setSchoolEnd(String SchoolEnd) {
        this.SchoolEnd = SchoolEnd;
    }

    
    
    
    
    public void registerAUser(){
        User user1 = new User(this.admin, this.fname, this.lname, this.DOB, this.email, this.city, this.state,
        this.zip, this.country, this.password, this.employer,this.title,this.description,this.JobStart, this.JobEnd,
        this.SchoolName,this.Major,this.SchoolStart,this.SchoolEnd);
        
        
        JDBCLayer myJDBC = new JDBCLayer();
        myJDBC.InsertAUser(user1);
        
    }
}
