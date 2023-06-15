import java.text.DecimalFormat;
/**
 *  Title:           NumberFormatter
 *  Semester:        COP3337  Summer 2023
 *  @author          Christian Rolando
 *
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *
 *  Description of program, and explanation of programming
 *  concept(s) being applied in the program: A number formatter, formats according to what class is used.
 *  Concepts applied: interfaces, "implements" keyword, formatting methods, toString, etc.
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    /** @param : int n
     @return : int n interpretated into a String and then formatted into DecimalFormat.
     @throws : N/A
     Description: Place commas according to integer number, e.g. 1,000 instead of 1000.
     */

    public String format(int n) {
    //Turn out integer to a String, then initialize DecimalFormat formatter and input pattern.
        String str = Integer.toString(n);
        DecimalFormat formatter = new DecimalFormat("#,###,###");
    //Return our now String as specified decimal format.
        return (formatter.format(n));
    }
}

