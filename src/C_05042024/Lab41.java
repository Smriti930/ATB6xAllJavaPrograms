package A06052024;
//Second Array should be double the size of first array
public class Lab41 {
    public static void main(String[] args) {
        int[] arrays={30,40,50};
        int[] arrays2=new int[3];
        for (int i = 0; i < arrays.length ; i++) {
            arrays2[i]=arrays[i]*2;
        }
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i]);
        }

    }
}
