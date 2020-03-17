import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    String data;
    Node prev, next;

    public Node() {
        this.data = null;
        this.prev = this.next = null;
    }

    public Node(String data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class LinkedList {
    Node depan, belakang,posisi;

    public void add(String point) {
        Node tambah = new Node(point);
        if (depan == null) {
            tambah.next = tambah.prev = tambah;
            depan = belakang = tambah;
            this.posisi=depan;
        } else {
            tambah.prev = belakang;
            belakang.next = tambah;
            depan.prev = tambah;
            tambah.next = depan;
            belakang = tambah;
        }
    }

    public String maju(int langkah) {
        for (int i = 0; i < langkah; i++) {
            posisi = posisi.next;
        }
            return posisi.data;
    }

    public String mundur(int langkah) {
        for (int i = 0; i < langkah; i++) {
            posisi = posisi.prev;
        }
            return posisi.data;
    }
}

public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        LinkedList li = new LinkedList();
        for (int i = 0; i < t; i++) {
            li.add(in.readLine());
        }
        int q = Integer.parseInt(in.readLine());
        String result = "";
        for (int i = 0; i < q; i++) {
            String[] query = in.readLine().split(" ");
            if (query[0].equals("Maju")) {
                //untuk instruksi maju
                result += li.maju(Integer.parseInt(query[1]));// parameter bernilai String
            } else {
                //untuk instruksi mundur
                result += li.mundur(Integer.parseInt(query[1]));// parameter bernilai String
            }
            if (i != q - 1) {
                result += "\n";
            }
        }
        System.out.println(result);
    }
}