public class q2 {
    private static class LinkedList {
        int data;
        LinkedList next;

        LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList insert(LinkedList head, int data) {
        LinkedList temp = new LinkedList(data);
        if (head == null) {
            head = temp;
            return head;
        }
        LinkedList ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = temp;
        return head;
    }
    public static void traversal(LinkedList head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    //delection
    public static LinkedList remove(LinkedList head) {
        if(head==null){
            return head;
        }
        LinkedList slowPtr = head;
        LinkedList fastPtr = head;
        while (true){
            slowPtr = slowPtr.next;
            if(fastPtr.next.next==slowPtr){
                fastPtr.next = null;
                break;
            }
            fastPtr = fastPtr.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 7);
        head.next.next.next.next.next = head.next.next;
        remove(head);
        traversal(head);
    }

}
