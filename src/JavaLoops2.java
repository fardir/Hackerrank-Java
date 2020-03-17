import java.util.*;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String[] arr = new String[q];
        int a = 0, b = 0, n = 0;
        for (int i = 0; i < q; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            arr[i] = series(a, b, n);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(arr[i]);
        }
        in.close();
    }

    public static String series(int a, int b, int n) {
        String result = null;
        for (int i = 0; i < n; i++) {
            a += Math.pow(2, i) * b;
            if (result == null) {
                result = a + " ";
            } else
                result += a + " ";
        }
        return result;
    }
}
