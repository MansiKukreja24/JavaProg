import java.io.*;
import java.util.*;

public class VasyaandSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
            if (sum % m == 0)
                sum++;

        }
        System.out.println(sum);
    }
}
