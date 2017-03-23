/**
 * Created by cadet on 3/23/2017 AD.
 */
public class EchoRule implements Rule{
    private  int input;

    public Boolean isAnswer(int input){
        this.input = input;
        return true;
    }
    @Override
    public  String getAnswer(){
        return Integer.toString(input);
    }

}
