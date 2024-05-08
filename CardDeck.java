import java.util.Random;
class CardDeck extends CardHolder{
    public CardDeck(){
        for (int var = 1; var<14; var++){
            for (int looper = 0; looper < 4; looper++){
                cardlist.add(new Card(var));
            }
        }   
    }
    public void shuffleDeck(){
        Random rand = new Random();
        for (int var = 0; var < 200; var++){
            cardlist.add(cardlist.remove(rand.nextInt(52)));
        }
    }
}
