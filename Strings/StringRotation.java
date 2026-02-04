// Problem: String Rotation
// Approach: Check if s2 is substring of s1 + s1
// Time Complexity: O(n)
// Space Complexity: O(n)

public class StringRotation {

    public static boolean isRotation(String s1, String s2) {

        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        String combined = s1 + s1;

        return combined.contains(s2);
    }
}
