// Problem: Longest Palindromic Substring
// Approach: Expand around center
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String input) {

        if (input == null || input.length() < 2) {
            return input;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length(); i++) {

            int len1 = expandFromCenter(input, i, i);
            int len2 = expandFromCenter(input, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return input.substring(start, end + 1);
    }

    private static int expandFromCenter(String input, int left, int right) {

        while (left >= 0 && right < input.length()
                && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
