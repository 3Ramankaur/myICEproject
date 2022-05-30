
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.number());//use a method to generate random *13
            c1.setSuits(c1.suit());//random method suit 
            magicHand[i]=c1;
            System.out.println(magicHand[i]);
        }
        //step 2:take input 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number between 1 and 13");
       int num=sc.nextInt();
        System.out.println("Enter a suit");
        String newsuit= sc.next();
        //step 3: match with array 
        for (Card magicHand1 : magicHand) {
            if (num == magicHand1.getValue()) {
                if (newsuit.equals(magicHand1.getSuits())) {
                    System.out.println("Match found");
                    break;
                } else {
                    System.out.println("Match not Found ");
                    
                }
            }
        }
    }
}
