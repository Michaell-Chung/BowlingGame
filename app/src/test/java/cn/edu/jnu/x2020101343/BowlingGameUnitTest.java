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
    @Test
    public void testOneSpare()  {
        rollSpare();
        game.roll(6);
        rollMany(17,0);
        assertEquals(22,game.score());
    }
    @Test
    public void testOneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertEquals(24, game.score());
    }
    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollMany(int pin, int times) {
        for(int i=0;i<times;i++){
            game.roll(pin);
        }
    }
}