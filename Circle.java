public class Test
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		c1.radius = 4.5;
		System.out.println(c1.area());
		System.out.println(c1.circumference());
	}
	public static class Circle
	{
	    double radius;
	    public double area()
	    {
		    return 3.14 * radius * radius;
	    }
	    public double circumference()
	    {
	        return 2.0 * 3.14 * radius;
	    }
	}
}