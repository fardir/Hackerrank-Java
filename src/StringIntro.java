import java.util.*;

public class StringIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        in.close();

        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(cap(A)+" "+cap(B));

    }
    public static String cap(String s){
        if (s==null||s.length()==0) {
            return s="";
        } else{
            return s.substring(0,1).toUpperCase() + s.substring(1);
        }
    }
}
