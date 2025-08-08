import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.DateTimeException;

public class Calendar {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calendar <day> <month> <year>");
            return;
        }

        try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            // Create date object
            LocalDate date = LocalDate.of(year, month, day);

            // Get the day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Format the day name (e.g., "Friday" instead of "FRIDAY")
            String formattedDay = dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();

            // Output the result
            System.out.println("The Day for given date is " + formattedDay);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for day, month, and year.");
        } catch (DateTimeException e) {
            System.out.println("Invalid date. Please enter a valid date (e.g. 28 08 2020).");
        }
    }
}