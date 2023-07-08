import java.util.*;
public class Salary
{
    public static void main (String[] args)
    {
        System.out.println("Enter your Monthly Salary: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * 12;
        System.out.println("Your Annual CTC is Rs"+ "." + m + "/-");
        if (m<250000)
        //If Taking Rs.20,000/- (approx 2.4L)
        {
            System.out.println("No need to pay Tax");
        }
        else if ((m>=250001) & (m<=500000)) 
        //If Taking Rs.41,600/- (approx 5L)
        {
            int a = m - 250000;
            double A = a * 0.10F ;
            System.out.println("You have to pay Rs" + "." + A + " /- as Tax");
        }
        else if ((m>=500001) & (m<=1000000))
        //If Taking Rs.83,300/- (approx 10L)
        {
            int a = m - 250000;
            double b = a - 500000;
            double B = (b * 0.20) + 50000;
            System.out.println("You have to pay Rs" + "." + B + " /- as Tax");
        }
        else
        //If Taking Rs.150000/- (approx 18L)
        {
            int a = m - 250000;
            double b = a - 500000;
            double c = b - 1000000;
            double C = (c * 0.30) + 50000 + 200000;
            System.out.println("You have to pay Rs" + "." + C + " /- as Tax");
        }
    }
}