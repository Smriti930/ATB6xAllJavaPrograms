package A06052024;

public class Lab35 {
    public static void main(String[] args) {
        int[] arr_element={21,45,35,57,43};
        int sum=0;
        for (int i = 0; i < arr_element.length; i++) {
            sum=arr_element[i]+sum;

        }
        System.out.println("Sum of all the elemnts in the array  :"+sum);
        double average=sum/2;
        System.out.println("Average is: "+average);
    }
}
