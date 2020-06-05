import java.io.*;
import java.util.*;
import java.lang.*;

public class TheatreSquare8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double a = sc.nextDouble();
        double cn = Math.ceil(n / a);
        double cm = Math.ceil(m / a);
        System.out.println((int) (cn * cm));

    }
}
