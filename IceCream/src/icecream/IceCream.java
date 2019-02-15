/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

import icecream.TextIO;

/**
 *
 * @author Studio
 */
public class IceCream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int strawberryCounter = 0;
        int totalCounter = 0;
        String flavor;

        TextIO.putln("test");
        TextIO.readFile("src/icecream/icecream.dat");
        while ( TextIO.eof() == false) {
            flavor = TextIO.getln();
            totalCounter++;
            if (flavor == "Strawberry"){
                strawberryCounter++;
            }    
        }

        double percentage = 100 * (strawberryCounter/totalCounter);

        TextIO.putln("There were " + totalCounter + " ice cream cones sold, " + strawberryCounter + " of which were Strawberry.");

        TextIO.putln("Therefore " + percentage + " percent of ice cream cones sold were Strawberry.");
        
    }
    
}
