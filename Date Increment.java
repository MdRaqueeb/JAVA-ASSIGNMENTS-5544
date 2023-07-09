import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateIncrement 
{
    public static void main(String[] args) 
    {
        Scanner pc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = pc.nextLine();
        LocalDate inputDate = LocalDate.parse(inputDateStr, DateTimeFormatter.ISO_DATE);
        System.out.print("Enter the number of days to increment: ");
        int incrementDays = pc.nextInt();
        LocalDate newDate = inputDate.plusDays(incrementDays);
        String newDateStr = newDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("New date: " + newDateStr);
    }
}
