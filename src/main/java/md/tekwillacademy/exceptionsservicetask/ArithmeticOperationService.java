package md.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {

    public static double divideWithoutExceptionHandling(int a, int b) {
        return a / b;
    }

    public static double divideWithErrorHandling(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException arithmeticErrorHandler) {
            System.out.println(arithmeticErrorHandler.getMessage());
            System.out.println("This is printed from a try catch block.");
            return 666;
        } finally {
            System.out.println("This is always printed, because it's a part of finally");
        }
    }
}
