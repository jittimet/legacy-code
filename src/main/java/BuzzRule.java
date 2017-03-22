/**
 * Created by cadet on 3/22/2017 AD.
 */
public class BuzzRule {

    public static final String BUZZ = "Buzz";

    public Boolean isAnswer(int input) {

        return input%5 == 0 ;
    }

    public String getAnswer() {

        return BUZZ;
    }
}
