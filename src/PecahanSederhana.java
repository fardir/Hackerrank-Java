import java.util.Scanner;

public class PecahanSederhana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a1 = in.nextLong();
        long b1 = in.nextLong();
        long a2 = in.nextLong();
        long b2 = in.nextLong();
//        if (b1 == 0 || b2 == 0) {
//            return;
//        }

//        long kpk = getKpk(b1, b2);
        long kpk = b1 * b2;
        long c1 = b2 * a1;
        long c2 = b1 * a2;
        long hasil = c1 + c2;
        long fpb = getFpb(hasil, kpk);
        hasil /= fpb;
        kpk /= fpb;
        System.out.printf("%d %d", hasil, kpk);
    }

    public static long getFpb(long num1, long num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num2;
    }

    public static long getKpk(long b1, long b2) {
        long kpk = 0;
        if (b1 == b2) {
            kpk = b1;
        } else if (b1 > b2) {
            if (b1 % b2 == 0) kpk = b1;
            else kpk = b1 * b2;
        } else if (b2 > b1) {
            if (b2 % b1 == 0) kpk = b2;
            else kpk = b1 * b2;
        }
        return kpk;
    }
}
