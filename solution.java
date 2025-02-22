import java.util.*;
public class solution {
    public static String longestRepeatedSubstring(String s) {
        int n = s.length();
        String[] suffixes = new String[n];
        // Generate suffix array
        for (int i = 0; i < n; i++) {
            suffixes[i] = s.substring(i);
        }

        // Sort the suffix array
        Arrays.sort(suffixes);

        // Find the longest common prefix (LCP) between adjacent suffixes
        String longestRepeated = "";
        for (int i = 0; i < n - 1; i++) {
            String lcp = longestCommonPrefix(suffixes[i], suffixes[i + 1]);
            if (lcp.length() > longestRepeated.length()) {
                longestRepeated = lcp;
            }
        }

        return longestRepeated;
    }

    private static String longestCommonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, minLength);
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(s));
    }
}
