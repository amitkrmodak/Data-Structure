import java.util.ArrayList;
import java.util.List;

//K-th level view
public class q8 {

    public static void KthLevelView(node root,int k,int currentLevel){
        if(root==null) return;

        if(k == currentLevel){
            System.out.println(root.data);
        }
        KthLevelView(root.left,k,currentLevel+1);
        KthLevelView(root.right,k,currentLevel+1);
    }
    public static void main(String[] args) {
//        node head = null;
//        creatBT BT = new creatBT();
//        head = BT.InsertAtleft(head, 1);
//        head = BT.InsertAtleft(head, 2);
//        head = BT.InsertAtRight(head, 3);
//        head = BT.InsertAtRight(head, 4);
//        head = BT.InsertAtleft(head, 5);
//        KthLevelView(head,2,1);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l.add(l2);
        l2.add(13);
        l2.add(14);
        l.add(l2);
        System.out.println(l2);
    }
}
