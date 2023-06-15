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
public class BaseFormatter implements NumberFormatter {
    int base;
    public BaseFormatter(int base){
        this.base = base;
    }
    /** @param : int n
     @return : String interpretation of int n, then calculated to its respective Base.
     @throws : N/A
     Description: Turn int n into String, then calculate what its Base # String is.
     */

    public String format(int n){
        //Turn int to String and calculate its Base.
       return Integer.toString(n, base);
    }
}
