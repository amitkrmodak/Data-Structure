//Height of a BT

import java.util.LinkedList;
import java.util.Queue;

public class q2 {

    public static int getHeight(node head) {
//        if (head == null) {
//            return 0;
//        }
//        var counter = 0;
//        Queue<node> queue = new LinkedList<>();
//        queue.add(head);
//        queue.add(null);
//        while (!queue.isEmpty()) {
//            node temp = queue.remove();
//            if (temp == null) {
////                System.out.println();
//                if (queue.isEmpty()) {
//                    break;
//                }
//                queue.add(null);
//                counter++;
//            } else {
////                System.out.println(temp.data);
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                }
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                }
//            }
//        }
//        return counter;
        if(head==null){
            return 0;
        }
        int leftHeight = getHeight(head.left);
        int rightHeight = getHeight(head.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);
        System.out.println(getHeight(head));

    }
}
