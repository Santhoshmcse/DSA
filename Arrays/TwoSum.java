import java.util.*;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

public class Main {
    public static void main(String[] args) {

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(new int[]{1,2,3,4}, 6);

        System.out.println(Arrays.toString(result));
    }
}
