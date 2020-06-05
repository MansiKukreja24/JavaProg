import java.io.*;
import java.util.*;


public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        String s1 = str.substring(0, 1).toUpperCase();
        System.out.println(s1 + str.substring(1));
    }
}
