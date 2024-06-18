package A06052024;
//Insert a specific element into any position of the array
import java.util.Arrays;

public class Lab38 {
    public static void main(String[] args) {
        int[] my_array={1,3,4,5,6,7,8,9,0};
        int pos=2;
        int num=2;

        for (int i = my_array.length-1; i >pos ; i--) {
            my_array[i]=my_array[i-1];
        }
        my_array[2]=num;
        System.out.println(Arrays.toString(my_array));

    }
}
