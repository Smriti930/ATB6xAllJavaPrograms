package A06052024;
import java.util.Arrays;
//double the number from given list and save the items in new array
public class Lab32 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] copy = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
            copy[i+arr.length] = arr[i];
        }

        System.out.println(Arrays.toString(copy));


    }
}
