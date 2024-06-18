package A06052024;

public class Lab36 {
    public static void main(String[] args) {
        int[] year={2011,2021,2023,2024,2026,2025};
        int spec_ele=year[4];
        for (int i = 0; i < year.length; i++) {
            if (year[i]==spec_ele)
            {
                System.out.println("Specific element found!!");
            }
            else {
                System.out.println("Element not found");
            }
        }
    }
}
