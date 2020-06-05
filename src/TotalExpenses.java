import java.io.*;
import java.util.*;

public class TotalExpenses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            double q = sc.nextDouble();
            double p = sc.nextDouble();
            double cost = q * p;
            double exp;
            if (q > 1000) {
                double d = (cost * 10) / 100;
                exp = cost - d;
                String s = String.format("%.6f", exp);
                System.out.println(s);
            } else {
                String s = String.format("%.6f", cost);
                System.out.println(s);
            }
        }
    }
}
