import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class node
{
    int data;
    node left = null;
    node right = null;
    node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class creatBT
{
    node InsertAtleft(node head,int data)
    {
        node temp = new node(data);
        if(head == null)
        {
            head = temp;
            return head;
        }
        node ptr = head;
        while (ptr.left != null)
        {
            ptr = ptr.left;
        }
        ptr.left = temp;
        return head;
    }
    node InsertAtRight(node head,int data)
    {
        node temp = new node(data);
        if(head == null)
        {
            head = temp;
            return head;
        }
        node ptr = head;
        while (ptr.right != null)
        {
            ptr = ptr.right;
        }
        ptr.right = temp;
        return head;
    }
    void InorderTraversal(node head){
        if (head == null){
            return;
        }
        InorderTraversal(head.left);
        System.out.println(head.data);
        InorderTraversal(head.right);
    }
    void LevelOrderTraversal(node head){
        if(head == null){
            return;
        }
        Queue<node> queue = new LinkedList<>();
        queue.add(head);
        queue.add(null);
        while (!queue.isEmpty()){
            node temp = queue.remove();
            if(temp==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                queue.add(null);
            }else {
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
    }
}
public class BinaryTree1 {
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head,1);
        head = BT.InsertAtleft(head,2);
        head = BT.InsertAtRight(head,3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);

//        BT.InorderTraversal(head);
        BT.LevelOrderTraversal(head);
    }
}
