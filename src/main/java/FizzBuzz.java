/**
 * Created by cadet on 3/22/2017 AD.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public String answer(int i) {
//        if(i==1) {
//            return "1";
//        }
        if(i==3 || i==6){
            return FIZZ;
        }
        if(i==5)
        {
            return BUZZ;
        }

        return Integer.toString(i);
    }

}
