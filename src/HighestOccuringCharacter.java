import java.io.*;
import java.util.*;


public class HighestOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int c[] = new int[n];
        char max = s.charAt(0);
        int m;
        char[] ch = s.toCharArray();
        for (int i = 0; i < n; i++) {
            c[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j] && ch[i] != '0') {
                    c[i]++;
                    ch[j] = '0';
                }
            }
        }
        m = c[0];
        for (int i = 0; i < n; i++) {
            if (m < c[i]) {
                m = c[i];
                max = ch[i];
            }
        }
        System.out.println(max);


    }
}
