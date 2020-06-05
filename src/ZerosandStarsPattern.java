import java.io.*;
import java.util.*;
public class ZerosandStarsPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < (2 * n) + 2; j++) {
                if (i == j || j == n + 1 || (i + j) == (2 * n) + 2)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
