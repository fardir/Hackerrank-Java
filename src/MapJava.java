import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MapJava{
    public static void main(String []argh) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.readLine();
            int phone=Integer.parseInt(in.readLine());
            map.put(name,phone);
        }
        String s;
        while((s = in.readLine()) != null)
        {
            if(map.containsKey(s)){
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
