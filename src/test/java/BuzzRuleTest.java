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
public class BuzzRuleTest {

    private BuzzRule game;

    private int input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection FizzBusData() {
        return Arrays.asList(new Object[][]{
                {5, true},
                {10, true}

        });
    }


    public BuzzRuleTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        game = new BuzzRule();
    }

    @Test
    public void shouldBe() {
        assertEquals(this.expected, game.isAnswer(this.input));
    }


}
