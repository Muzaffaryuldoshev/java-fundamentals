package classes_objects_p2_08;
import java.util.Arrays;

import static java.util.Arrays.*;


public class SumOfFirstThreeElements {

    public static void main(String[] args) {
        int[] arrays = new int[]{8, 3, 5, 2, 10, 4};
        Arrays.sort(arrays);
        //System.out.println(Arrays.toString(arrays));
        int[] arr = Arrays.copyOf(arrays,3);
       // System.out.println(Arrays.toString(arr));
        int result = 0;

        for (int n : arr) {
            result += n;
        }

        System.out.println("Result: " + result);
    }
}
