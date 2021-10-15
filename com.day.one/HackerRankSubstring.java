import java.util.*;
public class HackerRankSubstring{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
       // String subDa = S.subString(start,end);
        System.out.println(S.substring(start,end));
        
    }
    
}
