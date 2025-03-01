import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of data elements:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = s.nextInt();
            if (a[i] > 39 && a[i] < 101) {
                sum += a[i];
            }
        }
        
        System.out.println("The array elements are: " + Arrays.toString(a));
        System.out.println("The sum is: " + sum);
    }
}
