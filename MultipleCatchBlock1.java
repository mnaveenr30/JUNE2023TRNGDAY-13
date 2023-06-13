public class MultipleCatchBlock1{
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
            a[5]=30/2;
        }
        catch(ArithmeticException e){System.out.println("ArithmeticExceptionOccur");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException Occurs");}
        catch(Exception e){System.out.println("PArent Exception Occurs");}
        System.out.println("REST OF CODE....");
    }
}