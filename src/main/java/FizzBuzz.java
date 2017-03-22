/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";


    public String answer(int i) {

        if(isaFizzBuzz(i))
        {
            return FIZZ_BUZZ;
        }
        if (isaFizz(i)) {
            return FIZZ;
        }
        if (isaBuzz(i)) {
            return BUZZ;
        }

        return Integer.toString(i);
    }

    private boolean isaFizzBuzz(int i) {
        return isaFizz(i) && isaBuzz(i);
    }

    private boolean isaBuzz(int i) {
        return i%5 ==0;
    }

    private boolean isaFizz(int i) {
        return i%3 ==0;
    }

}
