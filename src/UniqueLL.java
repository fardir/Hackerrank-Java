import java.util.*;
class ULLNode{
    int data;
    ULLNode next;
    ULLNode(int d){
        data=d;
        next=null;
    }
}
public class UniqueLL{

    public static ULLNode removeDuplicates(ULLNode head) {
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
            removeDuplicates(head.next);
        }
        return head;
    }

    public static  ULLNode insert(ULLNode head,int data)
    {
        ULLNode p=new ULLNode(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            ULLNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(ULLNode head)
    {
        ULLNode start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ULLNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}