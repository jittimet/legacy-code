/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzRule {

    public static final String FIZZ = "Fizz";

    public boolean isAnswer(int input) {
        return input % 3 ==0;
    }

    public String getAnswer() {
        return FIZZ;
    }
}
