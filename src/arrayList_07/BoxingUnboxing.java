package arrayList_07;

import java.util.Arrays;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 6;
        Integer arr1 = Integer.valueOf(20);
        arr[1] = arr1;
        arr[2] = 4;

        System.out.println(Arrays.toString(arr));

    }

}
