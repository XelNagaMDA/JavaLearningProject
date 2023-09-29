package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 3;
        int max = 1007;

        // Printing the numbers that have 0 after modulo division.
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Printing the numbers that have 1 after modulo division.
        int i = min;
        while (i < max) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }

        int b = max;
        do {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b--;
        } while (b >= min);
    }
}
