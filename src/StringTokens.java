import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()){
            System.out.print(0);
            return;
        }
        String s = in.nextLine();
        String delims = "[ ,.!?\\_@']+";
        String[] token = s.trim().split(delims);
        if(s=="") {
            System.out.println(0);
        } else if(s.length()>400000){
            return;
        } else {
            System.out.println(token.length);
            for (String t: token) {
                System.out.println(t);
            }
        }
        in.close();
    }
}
