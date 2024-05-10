import java.util.Scanner;
//Add something tio check the hand for pairs immidetly aftert its been made
public class GoFishGame
{
    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();
        deck.shuffleDeck();
        CardHand player1 = new CardHand();
        CardHand player2 = new CardHand();

        int books1 = 0;
        int books2 = 0;  
        
        CardHand turn1Player = player1;
        CardHand turn2Player = player2;
        int turnCount = 3;

        for(int i = 0; i <= 6 ; i++) 
        {
            Card cardFromDeck = deck.removeCard();
            player1.addCard(cardFromDeck);
        }
        System.out.println("This is your hand Player 1:");
        player1.printCards();
        
        
        for(int i = 0; i <= 6 ; i++) 
        {
            Card cardFromDeck = deck.removeCard();
            player2.addCard(cardFromDeck);
        }
        System.out.println("This is your hand Player 2:");
        player2.printCards();
        
        while(player1 != null || player2 != null)
        {
            if(turnCount%2 == 1){
                turn1Player = player1;
                turn2Player = player2;
                System.out.println("Player 1 it is your turn.");
            }
            else
            {
                turn1Player = player2;
                turn2Player = player1;
                System.out.println("Player 2 it is your turn.");
            }
            turnCount++;
            
            //System.out.println("Player 1 it is your turn.");
            Turn(turn1Player, turn2Player, books1, deck);
            //System.out.println("Player 2 it is your turn.");
            //Turn(turn1Player,turn2Player, books2, deck);
            System.out.println("New TurnCount"+turnCount);
        }

        System.out.print("The game is over.");   
        if (books1 > books2) {
            System.out.println("Player 1 is the Winner!!");
        }                                                                                   
        else if (books1 < books2)
            System.out.println("Player 2 is the Winner!!");
        else{
            System.out.println("There was a tie!!");
        }
    }

    public static void Turn(CardHand turn1Player, CardHand turn2Player, int book, CardDeck deck) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ask the other Player for a card: "); 
        String guess = scan.nextLine();

        boolean lookThroughHand = turn2Player.findCard(guess);
        System.out.print("check boolean"+lookThroughHand);

        if(lookThroughHand == false)
        {
            System.out.println("Go Fish!!!!");
            Card temp = deck.removeCard();
            turn1Player.addCard(temp);
            System.out.println("You have drawn 1 card from the remaining deck");
            System.out.println("This is you new hand:");
            turn1Player.printCards();
        }
        else
        {
            turn2Player.pinchCard(guess);
            turn1Player.pinchCard(guess);
            book++;
            System.out.println("They had the card, you now have "+book+" books");
        } 
    } 
}
