package IceCream2 ;

import IceCream2.TextIO;

/**
 * @author Studio
 */

public class IceCream {


    public static void main(String[] args) {
        int strawberryCounter = 0;  // count of strawberry sold
        int totalCounter = 0;       // total sales counter
        String flavor;              // temporary variable to hold each line we read

        TextIO.readFile("src/IceCream2/icecream.dat");   //opens file

        while ( TextIO.eof() == false) {
            flavor = TextIO.getln();
            totalCounter++;
            if (flavor.equals("Strawberry")){
                strawberryCounter++;
            }
        }
        float percentage = ((float)strawberryCounter / totalCounter) * 100 ;    // the actual calculation of percentage
        String percentageFormatted = String.format("%.2f", percentage);         // formatting to 2 decimal place

        //at end of file...
        if ( TextIO.eof() == true ) {
            TextIO.putln("There were " + totalCounter + " ice cream cones sold, " + strawberryCounter + " of which were strawberry.");
            TextIO.putln("Therefore, " + percentageFormatted + " percent of ice cream cones sold were strawberry.");
        }
    }
}
