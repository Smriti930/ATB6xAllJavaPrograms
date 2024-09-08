package C_06202024.Encapsulation;

public class Lab63 {
    public static void main(String[] args) {
        vwologin v1=new vwologin("admin123","admin");
        String username=v1.getUsername();
        //code to authenticate password id isAuth is true
        String password=v1.getPassword(true);
    }

}

class vwologin{
    private String username;
    private String password;
//Normal parameterized constructor
    public vwologin(String password, String username) {
        this.password = password;
        this.username = username;
    }
//setter of username variable
    public void setUsername(String username) {
        this.username = username;
    }
//setter of password variable
    public void setPassword(String password) {
        this.password = password;
    }

    //getter for username variable
    public String getUsername() {
        return username;
    }
//getter for password variable
    public String getPassword() {
        return password;
    }
//creating function to authenticate for password
    public String getPassword(boolean isAuth)
    {
        if(isAuth)
        {
            return password;
        }
        else {
            return "Not allowed";
        }
    }

}
