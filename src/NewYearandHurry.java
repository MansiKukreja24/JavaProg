import java.io.*;
import java.util.*;

public class NewYearandHurry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        int c = 0;
        int j = 240 - k;
        for (int i = 1; i <= n; i++) {
            sum = sum + 5 * i;
            if (sum <= j && sum % 5 * i == 0)
                c++;

        }
        System.out.println(c);
    }
}
