import java.io.*;
import java.util.*;

public class CheapTravels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = m / b;
        int c1 = n * k;
        int c2 = n * a;
        int cost = 0;
        int min = Math.min(c1, c2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == n)
                    cost = a * i + k * j;
            }
        }
        System.out.println(Math.min(min, cost));
    }
}
