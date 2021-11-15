import java.util.ArrayList;
import java.util.Collections;

//Create a Deck class with an ArrayList of cards. (Deck should start of empty)

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>(); //starts empty
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int getCardCount() {
        return this.cards.size();
    }

    //Come up with a method to populate the deck of cards.

    public void populate() {
        for(int suit = 0; suit < 4; suit++) {
            for(int rank = 0; rank < 13; rank ++) {
                Card card = new Card(Suit.values()[suit], Rank.values()[rank]);
                this.addCard(card);
            }
        }
    }

    //Create a method to deal a card from the deck.
    public Card deal() {
        return this.cards.remove(0);
    }

    //Find a way to shuffle the cards.

    public void shuffle() {
        Collections.shuffle(cards); //NEW: shuffle
    }


    public ArrayList getCards() {
        return this.cards;
    }
}