package md.tekwillacademy.exceptionsservicetask;

public class TextManager {

    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWithTryCatch(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryCatchMethod) {
            System.out.println(exceptionFromTheTryCatchMethod.getMessage());
            return 0;
        }
    }

    public static int getTextLengthWithIf(String inputString) {
        if (inputString == null) {
            return 0;
        } else {
            return inputString.length();
        }
    }
}
