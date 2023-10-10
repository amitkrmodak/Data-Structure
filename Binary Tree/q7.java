//K-th level view

import java.util.LinkedList;
import java.util.Queue;

public class q7 {
    public static void KthView(node root,int k){
        if(root==null) return;

        Queue<node> queue = new LinkedList<>();
        Queue<node> ans = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int counter = 0;
        while (!queue.isEmpty()){
            if(counter==k-1){
                if(queue.peek()!=null){
                    ans.add(queue.peek());
                }
            }
            node temp = queue.remove();
            if(temp==null){
                counter++;
                if(queue.isEmpty()) break;
                queue.add(null);
            }else{
                if(temp.right!=null) queue.add(temp.right);
                if (temp.left!=null) queue.add(temp.left);
            }
        }
        for (node i: ans) {
            System.out.println(i.data);
        }
    }
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);
        KthView(head,4);
    }
}
