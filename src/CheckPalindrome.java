import java.io.*;
import java.util.*;
public class CheckPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n = s.length();
            String rev = "";
            for (int i = n - 1; i >= 0; i--)
                rev = rev + s.charAt(i);
            if (s.equals(rev))
                System.out.println("true");
            else
                System.out.println("false");

        }
    }
