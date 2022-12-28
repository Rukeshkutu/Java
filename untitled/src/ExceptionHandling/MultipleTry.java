package ExceptionHandling;

public class MultipleTry {
    public static void main(String[] args){
        try{
            int a=1/3;
            try {
                int b = Integer.parseInt("aaaaa");
                System.out.println(b);
            }
            catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
