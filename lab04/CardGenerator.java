///////////////////////////////////////////////////////
//Eric McMillan
//9-18-2015
//lab04
//Card Generator
//The purpose of this lab is to use the random number class to select a random number corresponding
//to a card in a deck then use switches to output both the number and the suit of the card

public class CardGenerator {
    // main method used for all programs in Java
    public static void main(String[] args) {
        int cardNumber;
        //use the math class to pick a rondom number that will be the value of the card
        cardNumber = (int)(Math.random()*53)+1;
        System.out.println(cardNumber); //temp check to make sure correct
        
        
        //if statement to determine if card is a diamond
        if (cardNumber >= 1 && cardNumber <=13) {
            
            //switch to output the correct card type and suit based on cardNumber that was picked
            //with special consideration taken for the cases where it is a face card
            switch (cardNumber){
                case 1:
                    System.out.println("The card you picked was the Ace of Diamonds");
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("The card you picked was the " +cardNumber + " of Diamonds");
                break;
                case 11:
                    System.out.println("The card you picked was the Jack of Diamonds");
                break;
                case 12:
                    System.out.println("The card you picked was the Queen of Diamonds");
                break;
                case 13:
                    System.out.println("The card you picked was the King of Diamonds");
                break;
                
            }// end of diamonds switch
        }// end of diamonds if
        if (cardNumber >= 14 && cardNumber <=26) {
             
             //adjust cardNumber to make it easier to work with / output
             cardNumber = cardNumber - 13;
             
            //switch to output the correct card type and suit based on cardNumber that was picked
            //with special consideration taken for the cases where it is a face card
            switch (cardNumber){
                case 1:
                    System.out.println("The card you picked was the Ace of Clubs");
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("The card you picked was the " +cardNumber + " of Clubs");
                break;
                case 11:
                    System.out.println("The card you picked was the Jack of Clubs");
                break;
                case 12:
                    System.out.println("The card you picked was the Queen of Clubs");
                break;
                case 13:
                    System.out.println("The card you picked was the King of Clubs");
                break;
            }//end of switch for Clubs
        }//end of if for Clubs
        
        //if statement to determine if card is a Heart
        if (cardNumber >= 27 && cardNumber <=39) {
             
             //adjust cardNumber to make it easier to work with / output
             cardNumber = cardNumber - 26;
             
            //switch to output the correct card type and suit based on cardNumber that was picked
            //with special consideration taken for the cases where it is a face card
            switch (cardNumber){
                case 1:
                    System.out.println("The card you picked was the Ace of Hearts");
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("The card you picked was the " +cardNumber + " of Hearts");
                break;
                case 11:
                    System.out.println("The card you picked was the Jack of Hearts");
                break;
                case 12:
                    System.out.println("The card you picked was the Queen of Hearts");
                break;
                case 13:
                    System.out.println("The card you picked was the King of Hearts");
                break;
            }//end of switch for Clubs
        }//end of if for Clubs
        
        //If statement to determine if card is a Spade
        if (cardNumber >= 40 && cardNumber <=52) {
             
             //adjust cardNumber to make it easier to work with / output
             cardNumber = cardNumber - 39;
             
            //switch to output the correct card type and suit based on cardNumber that was picked
            //with special consideration taken for the cases where it is a face card
            switch (cardNumber){
                case 1:
                    System.out.println("The card you picked was the Ace of Spades");
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("The card you picked was the " +cardNumber + " of Spades");
                break;
                case 11:
                    System.out.println("The card you picked was the Jack of Spades");
                break;
                case 12:
                    System.out.println("The card you picked was the Queen of Spades");
                break;
                case 13:
                    System.out.println("The card you picked was the King of Spades");
                break;
            }//end of switch for Clubs
        }//end of if for Clubs
    
    }//end of main method
    
}//end of class