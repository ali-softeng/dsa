/**
 * Time Complexity: O(N * M) - Comparing characters across all pairs.
 * Space Complexity: O(1) - Constant space approach.
 */
package arrays_strings.brute;

public class LongestCommonPrefixBrute {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Character by character check on every string pair
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefixBrute solver = new LongestCommonPrefixBrute();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Brute Force Output: " + solver.longestCommonPrefix(strs));
    }
}