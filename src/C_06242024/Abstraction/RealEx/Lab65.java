package C_06242024.Abstraction.RealEx;

public class Lab65 {
    public static void main(String[] args) {
        TC1_CHROME chrome=new TC1_CHROME();
        chrome.openBrowser();
        chrome.closeBrowser();

        TC2_FIREFOX firefox=new TC2_FIREFOX();
        firefox.openBrowser();
        firefox.closeBrowser();
    }
}
