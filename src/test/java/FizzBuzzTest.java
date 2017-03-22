import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzzTest {
    @Test
    public void oneShouldBe1(){
        FizzBuzz game = new FizzBuzz();
        assertEquals("1",game.answer(1));
        //assertFalse(true);
        // test false


    }
}
