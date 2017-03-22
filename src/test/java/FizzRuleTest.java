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
public class FizzRuleTest {

    private FizzRule game;

    private int input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection FizzBusData() {
        return Arrays.asList(new Object[][]{
                {3, true},
                {6, true}

        });
    }


    public FizzRuleTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        game = new FizzRule();
    }

    @Test
    public void shouldBe() {
        assertEquals(this.expected, game.isAnswer(this.input));
    }


}
