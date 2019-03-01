package codeexamples;

/**
 *
 * @author Studio
 */
public class CodeExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfDays = 0;
        float cashCollected = 0;
        float avg = 0;
        try {
            TextIO.putln("How much cash was collected?");
            cashCollected = TextIO.getFloat();
        } catch (NumberFormatException e1) {
            TextIO.putln("The amount was not a number");
        } catch (Exception e) {
            TextIO.putln("Something else happened.");
        }
        try {
            TextIO.putln("Over how many days?");
            numberOfDays = TextIO.getInt();
        } catch (NumberFormatException e1) {
            TextIO.putln("The number of days should be numeric");
        } catch (Exception e) {
            TextIO.putln("Something else happened");
        }
        try {
            avg = cashCollected/numberOfDays;
        } catch (ArithmeticException e2) {
            TextIO.putln("Problem with the math. Check for divide by zero.");
        }
                
        TextIO.putln("Number of Days: " + numberOfDays);
        TextIO.putln("Cash Collected: " + cashCollected);
        TextIO.putln("You averaged $" + avg + " per day.");
    }
    
}
