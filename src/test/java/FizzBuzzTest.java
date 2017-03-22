import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 3/22/2017 AD.
 */

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private FizzBuzz game;

    private int input;
    private String expected;

    @Parameterized.Parameters
    public static Collection FizzBusData() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, FizzBuzz.FIZZ},
                {5, FizzBuzz.BUZZ},
                {6, FizzBuzz.FIZZ},
                {10, FizzBuzz.BUZZ},
                {15,FizzBuzz.FIZZ_BUZZ }
        });
    }


    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        game = new FizzBuzz();
    }

    @Test
    public void shouldBe() {
        assertEquals(this.expected, game.answer(this.input));
    }


}
