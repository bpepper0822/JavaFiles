package firstsubroutines;
/**
 * 2/23/2019
 * @author Studio
 */
public class Firstsubroutines {

    public static void main(String[] args) {
        
        String userInput;       // Stores user input
        String stripped;        // Stores stripped input
        String flipped;         // Stores reversed input
        int plays = 0;          // Stores number of times to play
        
        TextIO.putln("Welcome to the palindrome checker");
        
        while ( plays < 2 ){    // Modify number of plays here
            
            TextIO.putln("Please enter a word or phrase:");
        
            userInput = TextIO.getln();                 // Prompts user for input
        
            stripped = stripWord(userInput);            // Calls stripWord with the raw user input
            flipped = flipWord(stripped);               // Calls flipWord with the returned value of stripWord
        
            TextIO.putln();
            TextIO.putln("stripped: " + stripped);
            TextIO.putln("reversed: " + flipped);
            TextIO.putln();
        
            if ( stripped.equals(flipped) ) {           // String equality check we learned in unit 3
                TextIO.putln("This IS a palindrome. Good job!");
                TextIO.putln();
            } 
            else {
                TextIO.putln("This IS NOT a palindrome.");
            }
            
            plays++;            // Iterates number of plays      
        }  
    }
       
    /*  
    This subroutine accepts a String, iterates backwards through it, and
    adds the characters to a new String variable. It then returns the
    variable    
    */
    public static String flipWord(String str) {
    
        int i;
        String reverse = "";
    
        for (i = str.length() - 1; i >= 0; i--) {
        
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    
    /*
    This subroutine effectively strips all It accepts a String, iterates through it from start to finish, 
    and adds all lowercase letters to a new String variable. It then returns 
    the variable.    
    */
    public static String stripWord(String str) {
        
        char eachCharacter;
        int i;
        String processed = "";
        
        str = str.toLowerCase();
        
        for ( i = 0; i < str.length(); i++ ){
            
            eachCharacter = str.charAt(i);
            
            if ( eachCharacter >= 'a' && eachCharacter <= 'z' ){
                
                processed = processed + str.charAt(i);
            }           
        }        
        return processed;
  }
}
