import java.util.ArrayList;
abstract class CardHolder {
    ArrayList<Card> cardlist = new ArrayList<Card>();
    public CardHolder(){
        
    }
    public Card removeCard(){
        return cardlist.remove(0);
    }
    public void addCard(Card newcard){
        cardlist.add(newcard);
    }
    public void printCards(){
        for (int var = 0; var < cardlist.size(); var++){
            System.out.println(cardlist.get(var).getName());
        }
    }
}
