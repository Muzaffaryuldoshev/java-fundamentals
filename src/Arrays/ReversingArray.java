package Arrays;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println((reverseArray(num)));
    }


    public static String reverseArray(int[] nums){
        int[] reversedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversedArray[i] = nums[nums.length - 1 -i];
        }
        return Arrays.toString(reversedArray);
    }

}
