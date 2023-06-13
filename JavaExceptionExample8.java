public class JavaExceptionExample8{
    public static void main(String args[]){
        try{
            int data1=50/0;
        }
        catch(Exception e){
            System.out.println(e+"\n\n\n\n\n");
            try{
                int data2=100/0;
            }
            catch(Exception a){System.out.println(a+"\n\n\n\n");}
        }
        System.out.println("REST OF THE CODE......");
    }
}