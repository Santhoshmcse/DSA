import java.util.*;

class LongestSubStringWithK {

    public String findLongestSubstring(String s, int k) {

        if (s == null || k == 0) {
            return "";
        }

        int left = 0, start = 0, maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);

                if (map.get(leftCh) == 0) {
                    map.remove(leftCh);
                }

                left++;
            }

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLength);
    }
}

public class Main {

    public static void main(String[] args) {

        LongestSubStringWithK obj = new LongestSubStringWithK();

        System.out.println(obj.findLongestSubstring("eceba", 2));   // ece
        System.out.println(obj.findLongestSubstring("aaabbcc", 2)); // aaabb
        System.out.println(obj.findLongestSubstring("abc", 0));     // ""
    }
}
