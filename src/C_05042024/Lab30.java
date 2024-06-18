package A06052024;
//different array possibility using datatypes
public class Lab30 {
    public static void main(String[] args) {
        int[] int_array={34,45,43};
        for (int i = 0; i < int_array.length; i++) {
            System.out.println("Int array list printing:"+" "+int_array[i]);
        }

        long[] long_array={34l,45l,43l};
        for (int i = 0; i < long_array.length; i++) {
            System.out.println("long array list printing:"+" "+long_array[i]);
        }
        float[] float_array={34.12f,45.12f,56.34f,89.45f};
        for (int i = 0; i < float_array.length; i++) {
            System.out.println("float array list printing:"+" "+float_array[i]);
        }
        double[] double_array={34.3,43.4,12.32};
        for (int i = 0; i < double_array.length; i++) {
            System.out.println("double array list printing:"+" "+double_array[i]);
        }
        boolean[] b_array={true,true,false,true,false};
        for (int i = 0; i < b_array.length; i++) {
            System.out.println("boolean array list printing:"+" "+b_array[i]);
        }
        char[] c_array={'A','B','D'};
        for (int i = 0; i < c_array.length; i++) {
            System.out.println("Character array list printing:"+" "+c_array[i]);
        }
        String[] S_array={"Smriti","Test1","Test2"};
        for (int i = 0; i < S_array.length; i++) {
            System.out.println("String array list printing:"+" "+S_array[i]);
        }

    }
}
