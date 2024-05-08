public class Card{
    int value;
    String name;
    public Card(int value){
        this.value = value;
        if(value == 1){
            name = "Ace";
        }
        else if(value>10){
            switch(value){
                case 11: name = "Jack";
                break;
                case 12: name = "King";
                break;
                case 13: name = "Queen";
            }
        }
        else{
            this.name = ""+this.value;
        }
    }
    public int getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
}