

class LinkedList{
    int data;
    LinkedList next;
    LinkedList(int data)
    {
        this.data = data;
        next = null;
    }
}
class List {
    LinkedList InsertAtEnd(int data, LinkedList head) {
        LinkedList temp = new LinkedList(data);
        if(head == null){
            head = temp;
            return head;
        }
        LinkedList ptr = head;
        while (ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = temp;
        return head;
    }
    LinkedList InserctionAtIndex(LinkedList head,int idx,int data) {
        LinkedList temp = new LinkedList(data);
        int counter = 0;
        if (head == null && counter != idx) {
            System.err.println("not sufficient index");
            return head;
        }
        LinkedList ptr = head;
        while (ptr != null && counter != idx) {
            ptr = ptr.next;
            counter++;
        }
        if (ptr == null) {
            System.err.println("index not found");
            return head;
        }
        if (idx == counter) {
            LinkedList testNext = ptr.next;
            ptr.next = temp;
            temp.next = testNext;
        }
        return head;
    }

    //delection
    LinkedList Deleteindex(LinkedList head,int idx)
    {
        LinkedList ptr = head;
        int counter = 0;
        while (ptr != null &&counter!=idx)
        {
            ptr = ptr.next;
            counter++;
        }
        if(counter==idx) {
            ptr.next = ptr.next.next;
        }
        return head;
    }
    void traversal(LinkedList head)
    {
        while (head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    LinkedList Riverce(LinkedList head)
    {
        if(head==null || head.next ==null)
        {
            return head;
        }
        LinkedList temp = Riverce(head.next);
        head.next.next = head;
        head.next = null;
        head = temp;
        return head;
    }
}


//careers@bigspire.com

public class singley_LinkedList_1 {
    public static void main(String[] args) {

        LinkedList head = null;
        List obj = new List();
        head = obj.InsertAtEnd(1,head);
        head = obj.InsertAtEnd(2,head);
//        obj.traversal(head);
        head = obj.InsertAtEnd(3,head);
        head = obj.InsertAtEnd(4,head);
        head = obj.Riverce(head);
        obj.traversal(head);
    }
}
