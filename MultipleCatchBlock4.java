public class MultipleCatchBlock4{
    public static void main(String args[]){
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e){System.out.println("Arithmetic Exception Occurs");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("Array Index out Of Bounds Exception Occurs");}
        catch(Exception e){System.out.println("Parent Exception Occurs");}
        System.out.println("REST OF CODE.....");
    }
}