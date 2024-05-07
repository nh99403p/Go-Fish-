import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class GoFishGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int books1 = 0;
        int books2 = 0;
        int[] deck = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11 ,12, 13, 14, 15 , 16 , 17 , 18};
        int[] player1 = {1, 2, 3, 4};
        int[]player2 = {1, 2, 3, 4};

        while(player1[] != null || player2[] != null)
        {
            System.out.print("Player 1 it is your turn.");
            Turn(player1, player2, books1);
            System.out.print("Player 2 it is your turn.");
            Turn(player1,player2, books2);
        }
        
        System.out.print("The game is over.");   
        if (books1 > books2) {
            System.out.print("Player 1 is the Winner!!");
        }                                                                                   )
        else if (books1 < books2)
            System.out.print("Player 2 is the Winner!!");
        else{
            System.out.print("There was a tie!!");
        }
    }

    public static void Turn(int player1[], int player2[], int book, ) 
    {
        while(player2[] != null || player1[] != null)
        {
            System.out.println("Player 1 ask Player 2 for a card"); 
            int guess = scan.nextInt();

            for (int i = 0; i < player2.length+1 ; i++) 
            {
                if(player2[guess] != player2[i])
                {
                    System.out.println("Go Fish!!!!");
                    System.out.println("You have drawn 1 card from the pile");
                    //add card from pile to player 1 hand
                    //print player 1 hand
                }
                if(player2[guess] == player2[i])
                {
                    // remove player2[i] from the array player2 wasn't sure how to dop with array
                    System.out.println("The card has been moved from player 2 to player 1's hand");
                    //remove card from player1 2 hand array
                    if(player2[guess] == player1[i])
                    {
                        //remove card from player1 hand
                    }   
                    book++;
                }
            }

        }
    }
}
