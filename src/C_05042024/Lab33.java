package A06052024;
//Find the larger number in the list of array
public class Lab33 {
    public static void main(String[] args) {
        int arr1[]={3,5,9,11};
      int  max_num=arr1[3];

        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i]==arr1[3])
            {
                System.out.println("Largest number in the list is:"+" "+arr1[i]);
            }
            else {
                System.out.println("Have not found larger number yet!!");
            }
        }
    }
}
