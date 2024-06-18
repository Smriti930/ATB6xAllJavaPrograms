package A06052024;
//2-D array when row and column are of equal length
public class Lab42 {
    public static void main(String[] args) {
        int[][] array_2d=
                {{34,12,11},
                {34,12,34},
                {11,23,98}};

//        int[][] array_2d_2=new int[3][3];

        for (int i = 0; i < array_2d.length; i++)//row=array_2d.length
        {
            for (int j = 0; j < array_2d[i].length; j++)//column
            {
                System.out.print(" "+array_2d[i][j]);
            }
            System.out.println();
        }

    }
}
