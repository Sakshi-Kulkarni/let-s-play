package js;

import java.util.*;

public class unsortedIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = new int[n];
         int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        // sum of all values in array using for loop

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;

        // frequency of number
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] == average)
                count++;
        System.out.println(count);

    }
}
