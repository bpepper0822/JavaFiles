/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Studio
 */
public class Enums {
    public enum CardSuits { Hearts, Diamonds, Clubs, Spades }    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for loop to iterate through the enum
        int size = CardSuits.values().length;
        for (int i = 0; i < size;i++) {
            System.out.println(CardSuits.values()[i]);
                    
        }
        for (CardSuits s: CardSuits.values()){
            System.out.println(s);
        }
    }
    
}
