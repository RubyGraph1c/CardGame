import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before() {
        player = new Player("Lucinda");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void canDealCardToHand() {
        player.addToHand(deck.deal());
        assertEquals(1, player.getHand().getCardCount());
    }

    @Test
    public void canGetName() {
        assertEquals("Lucinda", player.getName());
    }
}





