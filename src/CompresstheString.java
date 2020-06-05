import java.io.*;
import java.util.*;

public class CompresstheString {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            int n=s.length();
            char c=s.charAt(0);
            StringBuilder st=new StringBuilder();
            int count=1;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==c)
                    count++;
                else {
                    if(count>1)
                        st.append(""+c+count);
                    else
                        st.append(c);

                    count=1;
                    c=s.charAt(i);
                }
            }
            if(count>1)
                st.append(""+c+count);
            else
                st.append(c);
            System.out.println(st);





        }
}
