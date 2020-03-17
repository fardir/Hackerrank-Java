import java.util.ArrayList;
import java.util.Scanner;

public class ListJava {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            l.add(temp);
        }
        int query = in.nextInt();
        for (int i = 0; i < query; i++) {
            String act = in.next();
            if (act.equalsIgnoreCase("insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                l.add(index,value);
            } else if (act.equalsIgnoreCase("Delete")){
                int index = in.nextInt();
                l.remove(index);
            }
        }
        in.close();

        for (int list: l) {
            System.out.print(list + " ");
        }
    }
}