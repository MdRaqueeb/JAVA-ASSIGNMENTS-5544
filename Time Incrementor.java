import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TimeIncrementer 
{
    public static void main(String[] args) 
    {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + formatTime(currentTime));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours to increment: ");
        int h = sc.nextInt();
        System.out.print("Enter the number of minutes to increment: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of seconds to increment: ");
        int s = sc.nextInt();
        LocalTime newTime = currentTime.plusHours(h).plusMinutes(m).plusSeconds(s);
        System.out.println("New time: " + formatTime(newTime));
    }
    private static String formatTime(LocalTime time) 
    {
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}