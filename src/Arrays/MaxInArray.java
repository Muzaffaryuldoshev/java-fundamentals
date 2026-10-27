package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] num = {6, 8, 3, 5, 1, 9, 10};
        findMax(num);


    }

    public static void findMax(int[] nums){
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            maxNum = nums[0];
            if(maxNum < nums[i]){
                maxNum = nums[i];
            }
        }
        System.out.println("Max number in an Array: " + maxNum );
    }
}
