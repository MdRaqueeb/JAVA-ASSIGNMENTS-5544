import java.util.*;
public class WordCount
{
    public static void main(String []args)
    {
        System.out.println("Enter a Sentence: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Output String: " + a);
        int b = a.trim().split("\\s+").length;
        System.out.println("No. of Words in the String: " + b);
    }
}