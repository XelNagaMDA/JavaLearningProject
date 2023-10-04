package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroservice {
    public static void main(String[] args) {
        String controlVariable = null;

//        System.out.println("The string length is: " +TextManager.getTheTextLength(controlVariable));
        System.out.println("The string length is: " +TextManager.getTheTextLengthWithTryCatch(controlVariable));
        System.out.println("The string length is: " +TextManager.getTextLengthWithIf(controlVariable));

//        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(5, 0));
        System.out.println(ArithmeticOperationService.divideWithErrorHandling(5, 0));

        System.out.println("This message is always printed, since all errors are handled");

    }
}
