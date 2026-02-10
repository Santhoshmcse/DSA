import java.util.*;

class MinimumWindowSubstring {

    public String minimumWindow(String s, String t) {

        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int requiredCount = t.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    requiredCount--;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while (requiredCount == 0) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        requiredCount++;
                    }
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}

class Main {
    public static void main(String[] args) {
        MinimumWindowSubstring p = new MinimumWindowSubstring();
        System.out.println(p.minimumWindow("ADOBECODEBANC", "ABC")); // BANC
    }
}
