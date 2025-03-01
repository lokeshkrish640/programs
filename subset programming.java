import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 7};
        int target = 8;
        int left = 0;
        int right = a.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = a[left] + a[right];

            if (sum == target) {
                result[0] = left;
                result[1] = right;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (result[0] != 0 || result[1] != 0) {
            System.out.print(result[0] + "," + result[1]);
        } else {
            System.out.print("Not found");
        }
    }
}
