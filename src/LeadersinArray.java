import java.io.*;
import java.util.*;

public class LeadersinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String s = Arrays.toString(a);
        int f = 0, co = 0;
        for (int i = 0; i < n; i++) {
            int c = a[i];
            for (int j = i; j < n; j++) {
                int b = a[j];
                if (c < b) {
                    co++;
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                System.out.print(c + " ");
            f = 0;
        }


    }
}
