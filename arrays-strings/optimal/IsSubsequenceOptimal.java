/**
 * Time Complexity: O(n + m) - Single pass through both strings using two pointers.
 * Space Complexity: O(1) - In-place comparison without extra memory.
 */
package arrays_strings.optimal;

public class IsSubsequenceOptimal {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        // Jab tak dono strings ke boundaries ke andar hain
        while (sPointer < s.length() && tPointer < t.length()) {
            // Agar characters match ho jayein, to s ka pointer aage barhao
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            // t ka pointer har haal mein aage barhega
            tPointer++;
        }

        // Agar sPointer s ki length tak pohnch gaya, matlab saare characters mil gaye
        return sPointer == s.length();
    }

    public static void main(String[] args) {
        IsSubsequenceOptimal solver = new IsSubsequenceOptimal();
        System.out.println("Optimal Output: " + solver.isSubsequence("abc", "ahbgdc")); // Expected: true
    }
}