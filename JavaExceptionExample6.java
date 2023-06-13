public class JavaExceptionExample6{
    public static void main(String args[]){
            int p=100;
            int j=0;
            int data;
        try{
            data=p/j;
        }
        catch(Exception e){
            System.out.println(p/(j+2));
        }
    }
}