/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzzRule {

    public static final String FIZZ_BUZZ = "FizzBuzz";

    public boolean isAnswer(int input) {
        return input % 15 == 0;
    }

    public String getAnswer() {
        return FIZZ_BUZZ;
    }
}
