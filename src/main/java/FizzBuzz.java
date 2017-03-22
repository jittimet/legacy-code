import java.util.Arrays;
import java.util.List;

/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzz {


    public String answer(int i) {

        Rule fizzbuzzrule = new FizzBuzzRule();
        Rule fizzrule = new FizzRule();
        Rule buzzrule = new BuzzRule();
        List<Rule> rules = Arrays.asList(fizzbuzzrule,fizzrule,buzzrule);

        for( Rule rule: rules){
            if(rule.isAnswer(i )){
                return  rule.getAnswer();
            }
        }

       /* if(rules.get(0).isAnswer(i))
        {
            return rules.get(0).getAnswer();
        }*/

       /* if (fizzrule.isAnswer(i)) {
            return fizzrule.getAnswer();
        }

        if (buzzrule.isAnswer(i)) {
            return buzzrule.getAnswer();
        }*/

        return Integer.toString(i);
    }


}
