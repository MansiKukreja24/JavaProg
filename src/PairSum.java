import java.io.*;
import java.util.*;

class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int f = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    f = 1;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        if (f == 0)
            System.out.println("-1");

    }
}
