package md.tekwillacademy.bookcollectiontask;

public class IntNumberArrayService {
    public static int detectMin(int[] arrayTable) {
        int min = arrayTable[0];
        for (int i = 1; i < arrayTable.length; i++) {
            if (min > arrayTable[i]) {
                min = arrayTable[i];
            }
        }
        return min;
    }

    public static double calculateAverage(int[] arrayTable) {
        int sum = 0;
        for (int i = 0; i < arrayTable.length; i++) {
            sum = sum + arrayTable[i];
        }
        return sum / arrayTable.length;
    }
}
