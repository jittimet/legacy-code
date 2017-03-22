/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzRule implements Rule {

    public static final String FIZZ = "Fizz";

    public Boolean isAnswer(int input) {
        return input % 3 ==0;
    }

    public String getAnswer() {
        return FIZZ;
    }
}
