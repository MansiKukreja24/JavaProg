import java.io.*;
import java.util.*;
public class DominoPiling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d;
        if (m % 2 == 0)
            System.out.println((n * m) / 2);
        else {
            d = (n * (m - 1)) / 2 + (n / 2);
            System.out.println(d);
        }
    }
}
