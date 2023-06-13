public class MultipleCatchBlock5{
    public static void main(String args[]){
        try{
            int a[]=new int[5];  
            a[10]=50/0; 
        }
        catch(Exception e)
        {System.out.println("Common Task Is Coimpleatred");}
        catch(ArithmeticException e)
        {System.out.println("Task One Completed");}
        catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("Task Two Compleated");}
        System.out.println("REST OF THE CODE .....");
    }
}