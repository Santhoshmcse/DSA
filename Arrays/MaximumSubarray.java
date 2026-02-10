import java.util.*;

class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}


public class Main {
    public static void main(String[] args) {
    MaximumSubarray obj = new MaximumSubarray();
    System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
