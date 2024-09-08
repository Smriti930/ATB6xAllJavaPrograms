package C_07072024.EnumAndWrapperClasses;

public class Lab70 {
    public static void main(String[] args) {
        PAGES ref=PAGES.LOGIN;
        System.out.println(ref.getPage());
        System.out.println(ref.getUrl());

        PAGES ref1=PAGES.HOME;
        System.out.println(ref1.getUrl());
        System.out.println(ref1.getPage());

        PAGES ref2=PAGES.DASHBOARD;
        System.out.println(ref2.getPage());
        System.out.println(ref2.getUrl());
    }
}
