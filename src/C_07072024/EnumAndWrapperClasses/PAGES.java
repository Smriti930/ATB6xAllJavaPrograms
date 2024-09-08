package C_07072024.EnumAndWrapperClasses;

public enum PAGES {
HOME("https://app.vwo.com/","homePage"),
LOGIN("https://app.vwo.com/login/","loginPage"),
DASHBOARD("https://app.vwo.com/login/dashboard","dashboard");



    String page;
    String url;

    PAGES(String url ,String page ) {
        this.url=url;
        this.page = page;

    }

    public java.lang.String getUrl() {
        return url;
    }

    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
