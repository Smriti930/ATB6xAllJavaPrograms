package C_06202024.Encapsulation;

public class BaseClass {
    private String browser;

    public BaseClass() {
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if (isAuth)
        {
            this.browser = browser;
        }
        else {
            System.out.println("Not Allowed");
        }
    }
    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!!"+ browserName);
    }
    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void closeBrowser()
    {
        System.out.println("Close Browser!!");
    }
}
