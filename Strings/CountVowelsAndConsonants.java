// Problem: Count Vowels and Consonants
// Approach: Single pass traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountVowelsAndConsonants {

    public static int[] countVowelsAndConsonants(String input) {

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int vowels = 0;
        int consonants = 0;

        for (char ch : input.toLowerCase().toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}
