//check if LL is palindrome or not

public class q1 {

    private static class LinkedList {
        int data;
        LinkedList next;
        LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static LinkedList insert(LinkedList head, int data) {
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
    private static void traversal(LinkedList head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    //check if LL is palindrome or not
    public static LinkedList findMid(LinkedList head){
        if(head == null){
            return head;
        }
        LinkedList slowPtr = head;
        LinkedList fastPtr = head;
        while (fastPtr!=null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
    private static LinkedList rotateFromMid(LinkedList head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedList newHead = rotateFromMid(head.next);
        head.next.next =  head;
        head.next = null;
        head=newHead;
        return head;
    }

    private static boolean isPalindrome(LinkedList head){
        if(head == null || head.next == null){
            return false;
        }
        LinkedList mid = findMid(head);
        LinkedList newHead = rotateFromMid(mid);
        while(head!=null && newHead!=null){
            if(head.data != newHead.data){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);
//        head = insert(head, 4);
//        traversal(head);
//        System.out.println(findMid(head).data);
        System.out.println(isPalindrome(head));
    }
}
