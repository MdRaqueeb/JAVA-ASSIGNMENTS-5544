import java.util.*;
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. elements to be inserted: ");
        int size = sc.nextInt();
        int[] A = new int[size];

        System.out.println("Enter the Elements in sorted order:");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the element to searched: ");
        int key = sc.nextInt();
        int index = binarySearch(A, key);
        if (index != -1) 
        {
            System.out.println("Element" + " " + key + " " + "found at position " + (index + 1));
        } 
        else 
        {
            System.out.println("Element not found");
        }
    }
    private static int binarySearch(int[] A, int key) 
    {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (A[mid] == key) 
            {
                return mid;
            }

            if (A[mid] < key) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return -1;
    }
}