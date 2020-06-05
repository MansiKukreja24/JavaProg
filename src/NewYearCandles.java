import java.io.*;
import java.util.*;

public class NewYearCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while (a > 0) {
            c++;
            a--;
            if (c % b == 0)
                c++;
        }
        System.out.println(c);
    }
}
