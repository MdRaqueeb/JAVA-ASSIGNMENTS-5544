import java.util.*;
public class Shape 
{
    public static void main (String[] args)
    {
        Rectangle r1 = new Rectangle();
        System.out.println("Enter the Length of the Rectangle: ");
        Scanner sc = new Scanner (System.in);
        r1.length = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle: ");
        Scanner kc = new Scanner (System.in);
        r1.breadth = kc.nextInt();
        System.out.println("The Area of Rectangle is: " + r1.area());
        System.out.println("The Perimeter of Rectangle is: " + r1.perimeter());
        
    }
    public static class Rectangle
    {
        int length, breadth;
        public int area()
        {
            return length * breadth;
        }
        public int perimeter()
        {
            return 2 * (length + breadth);
        }
    }
}