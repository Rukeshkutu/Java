package ExceptionHandling;

public class ThrowsKeyword {
    public void divideByZero() throws ArithmeticException{
        throw new ArithmeticException("Divide by zero");
    }
    public static void main(String[] args){
        try{
            ThrowsKeyword throwsKeyword = new ThrowsKeyword();
            throwsKeyword.divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println("Exception Handled");
        }
    }
}
