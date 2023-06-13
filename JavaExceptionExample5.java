public class JavaExceptionExample5 extends Thread{
    public static void main(String args[]){
        Thread t=new Thread();
        t.start();
        try{
            int p=20;
            System.out.println("REST OF THE CODE.....");
            t.sleep(5000);
            int data=100/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Waiting.....");
    }
}