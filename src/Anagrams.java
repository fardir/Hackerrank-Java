import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if ((a==null||b==null)||(a.length()!=b.length())) return false;
        Map<Character,Integer> ana = new HashMap<>();

        char[] arrA = a.toUpperCase().toCharArray();
        for (int i=0;i<arrA.length;i++){
            if(ana.containsKey(arrA[i])){
                ana.put(arrA[i],(ana.get(arrA[i]) + 1));
            } else {
                ana.put(arrA[i],1);
            }
        }
        char[] arrB = b.toUpperCase().toCharArray();
        for (int i = 0; i < arrA.length; i++) {
            if (ana.containsKey(arrB[i])) {
                Integer count = ana.get(arrB[i]);
                if (count==0) return false;
                else {
                    count--;
                    ana.put(arrB[i],count);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
