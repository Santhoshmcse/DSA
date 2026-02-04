// Problem: Check Subsequence
// Approach: Two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CheckSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s == null || t == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
