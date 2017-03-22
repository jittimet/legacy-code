import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
                {3, FizzRule.FIZZ},
                {5, BuzzRule.BUZZ},
                {6, FizzRule.FIZZ},
                {10, BuzzRule.BUZZ},
                {15, FizzBuzzRule.FIZZ_BUZZ }
        });
    }


    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        List<Rule> rules = Arrays.asList(new FizzBuzzRule(), new FizzRule(), new BuzzRule());
        game = new FizzBuzz(rules);
    }

    @Test
    public void shouldBe() {
        assertEquals(this.expected, game.answer(this.input));
    }


}
