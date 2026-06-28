/**
 * Time Complexity: O(n * m) - Where n is length of s and m is length of t.
 * Space Complexity: O(1) - Constant space used.
 */
package arrays_strings.brute;

public class IsSubsequenceBrute {
    public boolean isSubsequence(String s, String t) {
        int lastFoundIndex = -1;

        // s ke har character ko t mein dhoondna
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;

            // t mein search pichle found index ke aglay element se shuru hogi
            for (int j = lastFoundIndex + 1; j < t.length(); j++) {
                if (t.charAt(j) == c) {
                    lastFoundIndex = j;
                    found = true;
                    break;
                }
            }

            // Agar koi character order mein na mile, to false
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequenceBrute solver = new IsSubsequenceBrute();
        System.out.println("Brute Force Output: " + solver.isSubsequence("abc", "ahbgdc")); // Expected: true
    }
}