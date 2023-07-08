import java.util.*;
public class MeterBill 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Current Meter Reading (CMR): ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Enter the Previous Meter Reading (PMR): ");
        int p = sc.nextInt();
        System.out.println("Enter the Category [D, C, I] of the Meter: ");
        char cat = sc.next().charAt(0);
        int u = c - p;
        System.out.println("The Total Billable Units are: " + u);

        switch (cat) {
            case 'D':
                if (u>=1 && u<=100) 
                {
                    int A = u * 1;
                    System.out.println("The Cost of the Billable units is: " + A);
                }
                else if (u>=101 && u<=200)
                {
                    int B = u * 2;
                    System.out.println("The Cost of the Billable units is: " + B);
                }
                else
                {
                    int C = u * 3;
                    System.out.println("The Cost of the Billable units is: " + C);
                }
                break;
            case 'C':
                if (u>=1 && u<=100) 
                {
                    int X = u * 2;
                    System.out.println("The Cost of the Billable units is: " + X);
                }
                else if (u>=101 && u<=200)
                {
                    int Y = u * 4;
                    System.out.println("The Cost of the Billable units is: " + Y);
                }
                else
                {
                    int Z = u * 6;
                    System.out.println("The Cost of the Billable units is: " + Z);
                }
                break;
            case 'I':
                if (u>=1 && u<=100) 
                {
                    int M = u * 3;
                    System.out.println("The Cost of the Billable units is: " + M);
                }
                else if (u>=101 && u<=200)
                {
                    int N = u * 6;
                    System.out.println("The Cost of the Billable units is: " + N);
                }
                else
                {
                    int O = u * 9;
                    System.out.println("The Cost of the Billable units is: " + O);
                }
                break;
            default:
                System.out.println("Invalid Category");
                break;
        }
    }
}