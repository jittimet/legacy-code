/**
 * Created by cadet on 3/23/2017 AD.
 */
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
public class EchoRuleTest {


FizzRule game;

    @Parameterized.Parameters
    public static Collection <Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {2, true}

        });
    }

    private int input;
    private boolean expected;


    public EchoRuleTest(int input, boolean expected) {
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
