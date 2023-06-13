public class JavaExceptionExample3{
    public static void main(String args[]){
        try{
            String S="abc";
            int i=Integer.parseInt(S);
        }
        catch(NumberFormatException e){System.out.println(e);}
        System.out.println("REST OF THE CODE .....");
    }
}