import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolisiBegal {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tkp = in.readLine().split(" ");
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        int begal = 0;
        for (int i = 0; i < tkp.length; i++) {
            if (tkp[i].contains("B")) begal++;
        }
        for (int i = 0; i < tkp.length; i++) {
            for (int j = 0; j < n; j++) {
                if (tkp[i].equals("P")){
                    if (!((i+(j+1)) >= tkp.length-1)) {
                        if (tkp[i+j+1].equals("B") && (count <= begal)) {
                            count++;
                            tkp[i+j+1] = "P";
                        }else if (tkp[tkp.length-1].equals("B") && count <= begal){
                            count++;
                            tkp[i+j+1] = "P";
                        }
                    }
                }
            }
        }
//        for (int i = 0; i < tkp.length; i++) {
//            System.out.println(tkp[i]+i);
//        }
//        System.out.println();
        System.out.println(begal);
        for (int i = 0; i < tkp.length; i++) {
            System.out.print(tkp[i]+" ");
        }
        System.out.println();
        System.out.println(count);
    }
}
