import java.io.*;
import java.util.*;

public class BuyaShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; ; i++) {
            if ((k * i - r) % 10 == 0 || (k * i) % 10 == 0) {
                System.out.println(i);
                break;
            }

        }

    }
}
