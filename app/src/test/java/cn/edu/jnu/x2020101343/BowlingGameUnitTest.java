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
        for(int i=0;i<20;i++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
    @Test
    public void testAllOnes() {
        for(int i=0;i<20;i++){
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}