package ExceptionHandling.ExceptionTasks;

public class ThrowsUseCase {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            meth1(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Now i am terminating peacefully TA! ");
    }

    static void meth1(int a, int b) throws ArithmeticException {
        System.out.println("Performing division...");
        if (b == 0) {
            throw new ArithmeticException("Bro why are you dividing with zero");
        }
        int c = a / b;
            System.out.println("a: " + a + " b: " + b + " c: " + c);
    }
}