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
public class DefaultFormatter implements NumberFormatter{
    /** @param : int n
     @return : String interpretation of int n
     @throws : N/A
     Description:  Return String interpretation of int n, regular formatting.
     */

    public String format(int n){
    //Simply return the String interpretation of our int "n".
        return String.valueOf(n);
    }
}
