import java.util.Scanner;

public class Nama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] ch = input.toCharArray();
        String nama = "";
        int count = 0;
        boolean a = true;
        int b = -1;
            for (int i = b + 1; i < ch.length; i++) {
                if (ch[i] == 'b' && nama.equals("")) {
                    nama += ch[i];
                    b = i;
                } else if (ch[i] == 'b'&&nama.equals("ben")) {
                    nama += ch[i];
                }
                if (ch[i] == 'e'&&nama.equals("b")) {
                    nama += ch[i];
                }else if (ch[i] == 'e'&&nama.equals("benb")) {
                    nama += ch[i];
                }
                if (ch[i] == 'n'&&nama.equals("be")) {
                    nama += ch[i];
                }else if (ch[i] == 'n'&&nama.equals("benbe")) {
                    nama += ch[i];
                }
                if (nama.equals("benben")) {
                    count++;
                    nama="";
                    nama = "";
                }
            }
        System.out.println(count);
    }
}
