/**
 * Time Complexity: O(N log N) - Sorting the array and comparing first and last element.
 * Space Complexity: O(1) - In-place character comparison.
 */
package arrays_strings.optimal;

import java.util.Arrays;

public class LongestCommonPrefixOptimal {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Sort lexicographically to compare first and last
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        LongestCommonPrefixOptimal solver = new LongestCommonPrefixOptimal();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Optimal Output: " + solver.longestCommonPrefix(strs));
    }
}