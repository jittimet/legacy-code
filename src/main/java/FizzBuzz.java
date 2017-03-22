import java.util.Arrays;
import java.util.List;

/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzz {


    private final List<Rule> rules;

    /*public FizzBuzz() {
        rules = Arrays.asList(new FizzBuzzRule(), new FizzRule(), new BuzzRule());
    }*/
    public FizzBuzz(List<Rule> rules){
        this.rules = rules;
    }

    public String answer(int i) {

        for( Rule rule: rules){
            if(rule.isAnswer(i )){
                return  rule.getAnswer();
            }
        }

        return Integer.toString(i);
    }


}
