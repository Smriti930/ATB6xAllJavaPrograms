package Practise;
//Print a star pattern of rectangle with 4 rows and 4 columns
//****
//*  *
//*  *
//****
public class Quest29 {
    public static void main(String[] args) {
        int row=4;
        int column=4;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if (i==0||j==0||i==row-1||j==column-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
