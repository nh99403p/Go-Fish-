public class CardHand extends CardHolder{
    
    public CardHand(){

    }
    public boolean findCard(String matchname){
        for (int var = 0; var < cardlist.size(); var++){
            if (cardlist.get(var).getName().equals(matchname)){
                return true;
            }
        }
        return false;
    }
    public Card pinchCard(String matchname){
        for (int var = 0; var < cardlist.size(); var++){
            if (cardlist.get(var).getName().equals(matchname)){
                return cardlist.remove(var);
            }
        }
        return new Card(0);
    }

    //I TRIED!!!!
    /*
    public void checkDoubles(){
        for (int var = 0; var < cardlist.size(); var++){
            if (cardlist.get(var).getName().equals(cardlist.get(var).getName())){

    }
    */
}
