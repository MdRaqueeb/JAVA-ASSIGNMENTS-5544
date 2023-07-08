import java.util.*;
public class ReverseofString
{
    public static void main(String []args)
    {
        System.out.println("Enter any Word/String: ");
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = new StringBuilder(S1).reverse().toString();
        System.out.println("The Reversed String is: " + S2);
    }
}