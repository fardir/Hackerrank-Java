import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperasiBiasa {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] n = in.readLine().split("");
        String hasil = "null";
        System.out.println(ops(n));
    }

    static String ops(String[] n) {
        String hasil = "null";
        long tmp = 0l;
        for (int i = 0; i < n.length; i++) {
            tmp += Long.parseLong(n[i]);
            hasil = String.valueOf(tmp);
            if(hasil.length()>1){
                String[] temp = hasil.split("");
                hasil = ops(temp);
            }
        }
        return hasil;
    }
}
