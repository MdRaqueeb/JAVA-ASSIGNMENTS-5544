import java.util.*;
public class Shape
{
    public static void main (String[] args)
    {
        Triangle t1 = new Triangle();
        System.out.println("Enter the Length of the Triangle: ");
        Scanner sc = new Scanner (System.in);
        t1.length = sc.nextInt();
        System.out.println("Enter the Breadth of the Triangle: ");
        Scanner kc = new Scanner (System.in);
        t1.breadth = kc.nextInt();
        System.out.println("Enter the height of the Triangle: ");
        Scanner pc = new Scanner (System.in);
        t1.height = pc.nextInt();
        System.out.println("The Area of Triangle is: " + t1.area());
        System.out.println("The Perimeter of Triangle is: " + t1.perimeter());
        
    }
    public static class Triangle
    {
        int length, breadth, height;
        public double area()
        {
            return ((height * breadth)/2);
        }
        public int perimeter()
        {
            return length + breadth + height;
        }
    }
}