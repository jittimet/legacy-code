import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzzTest {

    private FizzBuzz game;

    @Before
    public void setup(){
        game = new FizzBuzz();
    }

    @Test
    public void oneShouldBe1(){
        assertEquals("1", game.answer(1));
    }

    @Test
    public void twoShouldBe2(){
        assertEquals("2",game.answer(2));
    }


}
