/**
 * Time Complexity: O(n) - Single pass through the array with a start pointer.
 * Space Complexity: O(1) - No extra space utilized besides the result list.
 */
package arrays_strings.optimal;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesOptimal {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int start = nums[i]; // Start pointer for the current range

            // Single pass progression
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start == nums[i]) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRangesOptimal solver = new SummaryRangesOptimal();
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println("Optimal Output: " + solver.summaryRanges(nums));
    }
}