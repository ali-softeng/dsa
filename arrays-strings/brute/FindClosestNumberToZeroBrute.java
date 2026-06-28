/**
 * Time Complexity: O(n) - Linear scan through the array.
 * Space Complexity: O(1) - Constant space used.
 */
package arrays_strings.brute;

public class FindClosestNumberToZeroBrute {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            }

            else if (Math.abs(nums[i]) == Math.abs(closest)) {
                if (nums[i] > closest) {
                    closest = nums[i];
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroBrute solver = new FindClosestNumberToZeroBrute();
        int[] testCase = {-4, -2, 1, 4, 8};
        System.out.println("Brute Force Output: " + solver.findClosestNumber(testCase));
    }
}