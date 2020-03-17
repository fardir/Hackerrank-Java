class CircularNode{
    Object data;
    CircularNode prev,next;

    public CircularNode(Object data) {
        this.data = data;
    }

}
public class CircularDoublyLinkedList {
    CircularNode head,tail;
    int size;
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void addFirst(Object data){
        CircularNode temp = new CircularNode(data);
        temp = head;
        if (isEmpty()) {
            head = tail = temp;
            temp.next = temp.prev = temp;
        } else {
            temp.prev = tail;
            tail.next = head.prev = temp;
//            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void addLast(Object data){
        CircularNode temp = new CircularNode(data);
        temp = tail;
        if (isEmpty()){
            head = tail = temp;
            temp.next = temp.prev = temp;
        } else {
            temp.prev = tail;
            tail.next = head.prev = temp;
            temp.next = head;
            tail = temp;
        }
        size++;
    }
    public void addAfter(Object key, Object data){
        CircularNode temp = new CircularNode(data);
        CircularNode p = new CircularNode(key);
        if (key==tail.data){
            addFirst(data);
            return;
        } else {

        }
        size++;
    }
}
