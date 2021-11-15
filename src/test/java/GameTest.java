import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player("Lucinda");
        player2 = new Player("Murray");
    }

    @Test
    public void startsWithPopulatedDeck() {
        assertEquals(52, game.getDeckCount());
    }

    @Test
    public void startsWithDealer() {
        assertEquals("Dealer", game.getDealer().getName());
    }

    @Test
    public void canAddPlayers() {
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }
}

