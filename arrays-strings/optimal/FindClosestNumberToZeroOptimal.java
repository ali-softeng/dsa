/**
 * Time Complexity: O(n) - Single pass optimization with cleaner logic.
 * Space Complexity: O(1) - No extra memory used.
 */
package arrays_strings.optimal;

public class FindClosestNumberToZeroOptimal {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {

            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroOptimal solver = new FindClosestNumberToZeroOptimal();
        int[] testCase = {-4, -2, 1, 4, 8};
        System.out.println("Optimal Output: " + solver.findClosestNumber(testCase));
    }
}