/**
 * Time Complexity: O(n^2) - Nested checks for ranges in worst case.
 * Space Complexity: O(1) - Modifying output list only.
 */
package arrays_strings.brute;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesBrute {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int start = nums[i];
            int j = i;

            // Nested check to find how far the consecutive range goes
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            if (start == nums[j]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[j]);
            }
            i = j; // skip elements inside the range
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRangesBrute solver = new SummaryRangesBrute();
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println("Brute Force Output: " + solver.summaryRanges(nums));
    }
}