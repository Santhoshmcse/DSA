// Problem: Longest Common Prefix
// Approach: Horizontal scanning
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] words) {

        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
