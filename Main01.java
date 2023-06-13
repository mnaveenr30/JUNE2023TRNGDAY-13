import java.util.*;
class RollNumberException extends Exception{
    String n;
    RollNumberException(String n){
        super(n);
        this.n=n;
    }
    public String tostring(){
        return n;
    }
}
public class Main01{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int RL=s.nextInt();
        try{
            if(RL<54){
                throw new RollNumberException("This Roll Number Does Not Exist");
            }
        }
        catch(RollNumberException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        
    }
}