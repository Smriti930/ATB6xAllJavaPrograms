package A06052024;

import java.util.Arrays;

public class Lab37 {
    public static void main(String[] args) {
        int[] my_array={21,34,25,56,67,47,45,78,87};
        int[] new_array=new int[my_array.length];
        System.out.println("Old array is :"+Arrays.toString(my_array));
        for (int i = 0; i < my_array.length; i++) {
            new_array[i]=my_array[i];
        }
        System.out.println("New Array is :"+Arrays.toString(new_array));

    }
}
