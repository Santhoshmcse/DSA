import java.util.HashMap;
import java.util.Map;

// Problem: First Unique Character in String
// Approach: HashMap frequency counting
// Time Complexity: O(n)
// Space Complexity: O(n)

public class FirstUniqueCharacter {

    public static Character firstUniqueCharacter(String input) {

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : input.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;   // no unique character found
    }
}
