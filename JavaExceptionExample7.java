public class JavaExceptionExample7{
    public static void main(String args[]){
        try{
            int data1=50/0;
        }
        catch(Exception e){
            int data2=100/0;
        }
        System.out.println("REST OF THE CODE......");
    }
}