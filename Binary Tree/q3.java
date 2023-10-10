//Counts of nodes

import java.util.LinkedList;
import java.util.Queue;

public class q3 {

    public static int countNodes(node head){
        if(head==null){
            return 0;
        }
        int leftCount = countNodes(head.left);
        int rightCount = countNodes(head.right);
        return leftCount + rightCount +1;
    }
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);

        System.out.println(countNodes(head));
    }
}
