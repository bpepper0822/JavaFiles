/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyesaverage;

/**
 *
 * @author Studio
 */
public class SnakeEyesAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int totalTrials = 1000; // Modify this number to change the total number of trials
        int attemptCounter = 0;
        float runningSum = 0;        
        float snakeeyesCounter = 1;
        int die1 = 0;
        int die2 = 0;
        
        
        for (int i = 0; i < totalTrials; i++) {
            do {
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                ++attemptCounter;
                ++runningSum;
            } while (die1 != 1 || die2 != 1);

            if (die1 == 1 && die2 == 1) {
                
                TextIO.putln("Snake Eyes: " + attemptCounter + " rolls.");                
                attemptCounter = 0;
                snakeeyesCounter++;
            }
        }
        
        float runningAvg = (runningSum / snakeeyesCounter);
        TextIO.putln("After " + totalTrials + " trials, we rolled Snake Eyes every " + runningAvg + " dice rolls on average");
        
    }       
}
