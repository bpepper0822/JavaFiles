/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyes;

/**
 *
 * @author Studio
 */
public class SnakeEyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int attemptCounter = 0;
        int snakeeyesCounter = 0;
        int die1 = 0;
        int die2 = 0;
               
        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            ++attemptCounter;
        } while (die1 != 1 || die2 != 1);

        if (die1 == 1 && die2 == 1) {
            TextIO.putln("It took " + attemptCounter + " rolls to get Snake Eyes.");
            ++snakeeyesCounter;
            attemptCounter = 0;

        }      
    }       
}
