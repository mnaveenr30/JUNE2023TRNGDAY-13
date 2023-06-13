import java.util.Scanner;
class StudentMarksException extends Exception{
    int mark;
    String msg;
    StudentMarksException(String msg,int mark){
        //super(mark,msg);
        this.mark=mark;
        this.msg=msg;
    }
    public String toString(){
        return msg+mark;
    }
}
public class Main02{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        try{
            if(n>=35){
                throw new StudentMarksException("Student passed with a marks of "+n);
            }
        }
        catch(StudentMarksException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}