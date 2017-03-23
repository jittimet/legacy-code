import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

/**
 * Created by cadet on 3/23/2017 AD.
 */
public class FizzBuzzUsingRulesTest {

    @Test
    public void shouldVerifybyGivenRule(){
        Rule mockRule = Mockito.mock(Rule.class);
        //Mockito.when(mockRule.isAnswer(1)).thenReturn(true);
        FizzBuzz game = new FizzBuzz(Arrays.asList(mockRule));
        game.answer(2);
        Mockito.verify(mockRule).isAnswer(2);
    }

}
