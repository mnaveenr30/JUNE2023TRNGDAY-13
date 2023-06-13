import java.util.*;
class AgeDoesNotFitException extends Exception{
    String msg;
    AgeDoesNotFitException(String msg){
        super(msg);
        this.msg=msg;
    }
    @Override
    public String toString(){
        return msg;
    }
}
public class Main00{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        try{
            if(age<18){
                throw new AgeDoesNotFitException("Entered Age Doest Not Full Fill The Required Age Limit");
            }
        }
        catch(AgeDoesNotFitException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}