import java.util.List;

public class Dealer_Class {

    private DeckforFinal theDeck;
    private List<Cardforfinal> DealersHand;
    private int points;

    public DeckforFinal getTheDeck() {
        return theDeck;
    }

    public Cardforfinal[] FirstDeal(){
        Cardforfinal card1 = theDeck.deal();
        Cardforfinal card2 = theDeck.deal();
        Cardforfinal[] startingCards = {card1, card2};
        return startingCards;
    }

    public Cardforfinal DealaCard(){
        return theDeck.deal();
    }

    public List<Cardforfinal> ShowHand(){
        return DealersHand;
    }

    public void addToHand(Cardforfinal newCard){
        this.DealersHand.add(newCard);
    }
    
    public int getPoints() {
        return points;
    }


}
