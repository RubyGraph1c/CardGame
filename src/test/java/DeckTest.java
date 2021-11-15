import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(Suit.DIAMONDS, Rank.TWO);
    }

    @Test
    public void canAddCardsToDeck() {
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.getCardCount());
        deck.deal();
        assertEquals(51, deck.getCardCount());

    }

    @Test
    public void canReturnNextCardFromDeck() {
        deck.addCard(card);
        assertEquals("TWO of DIAMONDS", deck.deal().stringify());
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canShuffle() {
        deck.populate();
        deck.shuffle();
        assertNotEquals("TWO of DIAMONDS", deck.deal().stringify());
    }
}