import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {

   
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Run: java PrintCalendar <month> <year>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        printMonth(year, month);
    }

    // print the full calendar 
    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    // print the title 
    public static void printMonthTitle(int year, int month) {
        System.out.println("\n       " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    // days of the month 
    public static void printMonthBody(int year, int month) {
        Calendar cal = new GregorianCalendar(year, month - 1, 1);

        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int totalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
}