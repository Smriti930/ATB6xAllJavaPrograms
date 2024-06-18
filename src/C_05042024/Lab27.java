package A06052024;
//when the arrays are equal
public class Lab27 {
    public static void main(String[] args) {

        int[] arr1={11,22,33,44,55};
        int[] arr2={22,43,45,56,87};
        int arr3[]=arr1;
        System.out.println(arr1==arr3);//always true ,because it returns the reference variable
        System.out.println(arr1.equals(arr3));


    }
}
