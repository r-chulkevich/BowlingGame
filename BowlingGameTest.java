import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ���� on 05.05.2015.
 */
public class BowlingGameTest {

    @Test
    public void CreateGame() {
        BowlingGame game = new BowlingGame();
    }

    @Test
    public void canRoll() {
        BowlingGame game = new BowlingGame();
        game.roll(0);
    }

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 0);
        assertEquals(0, game.score());
    }

    private void rollMany(BowlingGame game, int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void allOnes() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 1);
        assertEquals(20, game.score());

    }


}
