package cn.edu.jnu.x2020101343;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros() {
        rollMany(0,20);
        assertEquals(0,game.score());
    }
    @Test
    public void testAllOnes() {
        rollMany(1, 20);
        assertEquals(20, game.score());
    }

    public void testOneSpare() throws Exception {
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16,game.score());

    }
    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollMany(int pin, int times) {
        for(int i=0;i<20;i++){
            game.roll(pin);
        }
    }
}