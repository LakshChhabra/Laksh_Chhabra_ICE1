/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of objects
        for( int i=0;i<magicHand.length;i++)
        {
            
            magicHand[i] = new Card();

            magicHand[i].setValue(1);//use a method to generate random *13
            magicHand[i].setSuits("");//random method suit 



           System.out.println(magicHand[i].toString());


        }
        //step 2:take input 
        
        //step 3: match with array 
    }
    
}
