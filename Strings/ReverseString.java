// Problem: Reverse String
// Approach: Two pointers swapping
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseString {

    public static String reverse(String input) {

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}
