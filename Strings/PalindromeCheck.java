// Problem: Check Palindrome
// Approach: Two pointers from both ends
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PalindromeCheck {

    public static boolean isPalindrome(String input) {

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
