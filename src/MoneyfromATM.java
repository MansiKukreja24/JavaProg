import java.io.*;
import java.util.*;

public class MoneyfromATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double d;
        if (x % 5 == 0 && x < y) {
            d = (y - x) - 0.50;
            String str = String.format("%.2f", d);
            System.out.println(str);
        } else {
            String s = String.format("%.2f", y);
            System.out.println(s);
        }
    }
}
