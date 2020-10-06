/**
 * Brief summary of this class, ending with a period.
 *
 * It is common to leave a blank line between the summary and further details.
 * The summary (everything before the first period) is used in the class or
 * package overview section.
 *
 * Optionally, the following tags may be used at the end of class documentation
 * (not an exhaustive list):
 *
 * @author Doctor Vee
 * @version 1.5
 * @since 2/9/2020
 *
 *             GoalKicker.com – Java® Notes for Professionals 19 You can also
 *             have custom tags for displaying additional information. Using
 *             create a custom tag.
 *
 *             Example custom tag and generation:
 *                 The above flag will display the value of @custom.updated
 *                 under "Updated in version:"
 *
 */

public class ManPrint {
    /**
     * SumThem Methodation this method adds 2 integer numbers together and returns
     * an integer
     * 
     * @param a the first value
     * @param b the second value
     * @return The sum of both values
     */
    public static int sumThem(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // creates a value for man
        int man = 234;
        // creates a value for woman
        int woman = 45;
        int couple = sumThem(man, woman);
        System.out.println(couple);
    }
}