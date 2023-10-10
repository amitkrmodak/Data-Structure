//Subtree of a tree

import java.util.LinkedList;
import java.util.Queue;

public class q5 {
    public static boolean isIdentical(node root,node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(node root,node subRoot) {
        if(root == null) return false;
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);

        node test = null;
        creatBT BT2 = new creatBT();
//        test = BT2.InsertAtleft(test, 1);
//        test = BT2.InsertAtleft(test, 2);
//        test = BT2.InsertAtRight(test, 3);
        test = BT2.InsertAtRight(test, 4);

        System.out.println(isSubtree(head,test));
    }
}
