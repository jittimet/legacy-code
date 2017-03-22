/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzzRule implements Rule{

    public static final String FIZZ_BUZZ = "FizzBuzz";

    public Boolean isAnswer(int input) {
        return input % 15 == 0;
    }

    public String getAnswer() {
        return FIZZ_BUZZ;
    }
}
