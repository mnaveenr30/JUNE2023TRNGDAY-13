public class MultiCatchblock2{
    public static void main(String args[]){
        try{
            int a[]=new int[5];  
            a[5]=50;
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println("\n\n\n\nArrayIndexOutOfBoundsException Occurs\n\n\n\n");}
        catch(Exception a){System.out.println("Parent Exception Occurs\n\n\n\n");}
        System.out.println("REST OF THE CODE .....\n\n\n\n");
    }
}