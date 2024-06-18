package Practise;
//Print a star pattern of rectangle with 4 rows and 5 columns
//****
//****
//****
//****
public class Quest27 {
    public static void main(String[] args) {
        int row=4;
        int column=5;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
