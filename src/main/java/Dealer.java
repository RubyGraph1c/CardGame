
public class Dealer extends Player{

    private Deck deck;

    public Dealer(Deck deck) {
        super("Dealer");
        this.deck = deck;
    }

    public Card deal() {
        return this.deck.deal();
    }

    public void shuffle() {
        this.deck.shuffle();
    }
}