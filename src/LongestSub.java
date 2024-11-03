import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LongestSub {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Remove characters from the left until there are no duplicates
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update the maximum length found
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSub longestSub = new LongestSub();
        System.out.println(longestSub.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(longestSub.lengthOfLongestSubstring("pwwkew"));
        System.out.println(longestSub.lengthOfLongestSubstring("bbbbbb"));
        System.out.println(longestSub.lengthOfLongestSubstring("au"));
        System.out.println(longestSub.lengthOfLongestSubstring("abcb"));
    }
}
