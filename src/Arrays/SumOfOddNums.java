package Arrays;

public class SumOfOddNums {
    public static void main(String[] args) {
        int[] num = {2, 5, 7, 2, 3};
        sumOdds(num);

    }

    public static void sumOdds(int[] nums){
        int sumOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]  % 2 != 0){
               sumOdd += nums[i];
            }
        }
        System.out.println("Sum of Odd numbers in an array: "+sumOdd);

    }

}
