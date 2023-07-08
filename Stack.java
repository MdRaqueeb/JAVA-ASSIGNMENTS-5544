import java.util.*;
public class DynamicStack 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        char choice;
        do 
        {
            System.out.println("Choose 1 to Push (or) 2 to POP: ");
            System.out.println("Enter your choice: ");
            choice = sc.next().charAt(0);
            switch (choice) 
            {
                case '1':
                    if (stack.size() < 10) 
                    {
                        System.out.println("Enter element to push: ");
                        int e1 = sc.nextInt();
                        stack.push(e1);
                    } 
                    else 
                    {
                        System.out.println("Stack Overflow!");
                        break;
                    }
                    break;
                case '2':
                    if (!stack.isEmpty()) 
                    {
                        int e2 = stack.pop();
                    } 
                    else 
                    {
                        System.out.println("Stack Underflow!");
                        break;
                    }
                    break;
                default:
                    System.out.println("Program Terminated");
                    break;
            }
            System.out.println("Stack: " + stack);
            System.out.println();
        } 
        while (choice == '1' || choice == '2');
    }
}