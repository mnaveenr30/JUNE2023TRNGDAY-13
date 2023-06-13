public class JavaExceptionExample9{
    public static void main(String args[]){
        try{
            int a[]=new int[5];  
            a[5]=50;
        }
        //catch(ArrayIndexOutOfBoundsException e){System.out.println(e+"\n\n\n\n");}
        catch(Exception a){System.out.println(a+"\n\n\n\n");}
        System.out.println("REST OF THE CODE .....");
    }
}