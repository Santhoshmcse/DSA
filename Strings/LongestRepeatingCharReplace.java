class LongestRepeatingCharReplace {

    public int longestRepeatingChar(String str,int k){

        if(str == null){
            throw new IllegalArgumentException("String cannot be null");
        }

        str = str.toUpperCase();

        int left = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int result = 0;

        for(int right = 0; right < str.length(); right++){

            char ch = str.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            while((right - left + 1) - maxFreq > k){
                freq[str.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        LongestRepeatingCharReplace l = new LongestRepeatingCharReplace();
        System.out.println(l.longestRepeatingChar("abcabcbb",2));
    }
}
