package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        // Enter the day name. Print the day number at the console.
        int dayNumber;
        String dayName = "Saturday";

        switch (dayName.toLowerCase()) {
            case "monday":
                dayNumber = 1;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "tuesday":
                dayNumber = 2;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "wednesday":
                dayNumber = 3;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "thursday":
                dayNumber = 4;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "friday":
                dayNumber = 5;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "saturday":
                dayNumber = 6;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            case "sunday":
                dayNumber = 7;
                System.out.println("The day is found. It is: " + dayNumber);
                break;
            default:
                System.out.println("There is no such day number defined by your program.");
        }


    }
}
