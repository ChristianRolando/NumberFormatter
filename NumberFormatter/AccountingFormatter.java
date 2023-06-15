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
public class AccountingFormatter implements NumberFormatter {
    /** @param : int n
     @return : the result of our int n IF it is a negative number
     @throws : N/A
     Description: Check if int is negative, turn into a positive and insert it between parentheses.
     */

    public String format(int n){
        String result;
        //Check if our integer is neg, if so, turn positive and place inside parenthesis.
        if(n < 0){
            n = n * -1;
            result = "(" + n + ")";
        }else{
            result = String.valueOf(n);
        }

        return result;
    }
}
