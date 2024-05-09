import java.util.Scanner;

public class GoFishGame
{
    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();
        CardHand player1 = new CardHand();
        CardHand player2 = new CardHand();

        int books1 = 0;
        int books2 = 0;  
        
        CardHand turn1Player = player1;
        CardHand turn2Player = player2;
        int turnCount = 1;

        for (int i = 0; i <= 7 ; i++) 
        {
            Card cardFromDeck = deck.removeCard();
            player1.addCard(cardFromDeck);
            i++;
        }
        player1.printCards();
        
        
        while(player1 != null || player2 != null)
        {
            if(turnCount/2 == 1){
                turn1Player = player1;
                turn2Player = player2;
            }
            else
            {
                turn1Player = player2;
                turn2Player = player1;
            }
            turnCount++;
            
            System.out.print("Player 1 it is your turn.");
            Turn(turn1Player, turn2Player, books1, deck);
            System.out.print("Player 2 it is your turn.");
            Turn(turn1Player,turn1Player, books2, deck);
            
        }
        
        System.out.print("The game is over.");   
        if (books1 > books2) {
            System.out.print("Player 1 is the Winner!!");
        }                                                                                   
        else if (books1 < books2)
            System.out.print("Player 2 is the Winner!!");
        else{
            System.out.print("There was a tie!!");
        }
    }

    public static void Turn(CardHand turn1Player, CardHand turn2Player, int book, CardDeck deck) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Player 1 ask Player 2 for a card"); 
        String guess = scan.nextLine();

        boolean lookThroughHand = turn2Player.findCard(guess);
        
        if(lookThroughHand == true)
        {
            turn2Player.pinchCard(guess);
            book++;
            System.out.print(book);
            //turn1Player.printCards(); //maybe unnessesary to print the hand right here it doesnt change
        }
        else
        {
            System.out.println("Go Fish!!!!");
            Card temp = deck.removeCard();
            turn1Player.addCard(temp);
            System.out.println("You have drawn 1 card from the remaining deck");
            turn1Player.printCards();
        } 
    } 
}
