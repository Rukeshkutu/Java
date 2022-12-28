package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args){
        try{
            int a = 3/5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
