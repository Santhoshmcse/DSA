import java.util.HashSet;
import java.util.Set;

// Problem: Longest Substring Without Repeating Characters
// Approach: Sliding window
// Time: O(n)
// Space: O(n)

public class LongestSubstringWithoutRepeating {

    public static int longestSubstringWithoutRepeating(String input) {

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < input.length(); right++) {

            while (set.contains(input.charAt(right))) {
                set.remove(input.charAt(left));
                left++;
            }

            set.add(input.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
