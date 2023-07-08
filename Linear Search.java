import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int j;
        for (j = 0; j < n; j++) 
        {
            if (a[j] == key) {
                System.out.println("The element is found at position: " + (j + 1));
                break;
            }
        }
        if (j == n) {
            System.out.println("The element is not found");
        }
    }
}