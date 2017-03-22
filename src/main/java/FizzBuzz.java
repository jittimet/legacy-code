/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzz {


    public String answer(int i) {

        FizzBuzzRule fizzbuzzrule = new FizzBuzzRule();
        if(fizzbuzzrule.isAnswer(i))
        {
            return fizzbuzzrule.getAnswer();
        }
        FizzRule fizzrule = new FizzRule();
        if (fizzrule.isAnswer(i)) {
            return fizzrule.getAnswer();
        }
        BuzzRule rule = new BuzzRule();
        if (rule.isAnswer(i)) {
            return rule.getAnswer();
        }

        return Integer.toString(i);
    }

    /*private boolean isaBuzz(int i) {
        return i%5 ==0;
    }

    private boolean isaFizz(int i) {
        return i%3 ==0;
    }*/

}
