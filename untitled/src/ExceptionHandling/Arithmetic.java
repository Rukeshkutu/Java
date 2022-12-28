package ExceptionHandling;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Part to run after exception handling");
    }
}
