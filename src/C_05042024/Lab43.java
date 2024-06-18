package A06052024;
//2-D array with with different row and columns length
public class Lab43 {
    public static void main(String[] args) {
        int[][] array_2d=
                {{34,12,11},
                {34,12,34}};

        for (int i = 0; i < array_2d.length; i++)//0,1
        {
            for (int j = 0; j < array_2d[i].length; j++)//column-1 -34,12,11,column-2 -34,12,34
            {
                System.out.print(" "+array_2d[i][j]);
            }
            System.out.println();
        }
    }
}
