/**
 * Created by cadet on 3/22/2017 AD.
 */
public class BuzzRule implements Rule {

    public static final String BUZZ = "Buzz";

    @Override
    public Boolean isAnswer(int input) {

        return input%5 == 0 ;
    }

    @Override
    public String getAnswer() {

        return BUZZ;
    }
}
