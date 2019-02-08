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

        System.out.println("Hello World");
        System.out.println("Hello world!");

        int attemptCounter = 0;
        float runningSum = 0;        
        float snakeeyesCounter = 1;
        int die1 = 0;
        int die2 = 0;
        
        
        for (int i = 0; i < 10000; i++) {
            do {
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                ++attemptCounter;
                ++runningSum;
            } while (die1 != 1 || die2 != 1);

            if (die1 == 1 && die2 == 1) {
                float runningAvg = (runningSum / snakeeyesCounter);
                System.out.println("It took " + attemptCounter + " tries.");
                System.out.println("You average Snake Eyes every " + runningAvg + " dice rolls");                
                attemptCounter = 0;
                snakeeyesCounter++;

            }
        }
    }       
}
