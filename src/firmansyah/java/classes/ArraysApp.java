package firmansyah.java.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {121,3,5,31,1,31,3,1,4,6,3,52,31,411,241,1,32,2,14};

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 2));
        System.out.println(Arrays.binarySearch(number, 1));
        
        int[] result1 = Arrays.copyOf(number, 6);
        System.out.println(Arrays.toString(result1));
        int[] result2 =  Arrays.copyOfRange(number, 3, 6);
        System.out.println(Arrays.toString(result2));
    }
}
