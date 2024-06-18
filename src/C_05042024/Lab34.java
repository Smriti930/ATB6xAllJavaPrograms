package A06052024;
//sort an array having one of them numeric and String types
import java.util.Arrays;

public class Lab34 {
    public static void main(String[] args) {
        int[] num_array={110,2345,93747,13,32434,989};
        String[] stg_array={"Mango","Pineapple","Guava","Apple"};
        for (int i = 0; i < num_array.length; i++) {
            Arrays.sort(num_array);

        }
        System.out.println("Sorted numeric array is:"+" "+Arrays.toString(num_array));

        for (int j = 0; j < stg_array.length; j++) {
            Arrays.sort(stg_array);
        }
        System.out.println("Sorted string array is:"+" "+Arrays.toString(stg_array));
    }
}
