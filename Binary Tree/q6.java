import java.util.HashMap;
import java.util.HashSet;

public class q6 {

    public static HashMap<Integer,Integer> topView(node head, int horizontalDistance, HashMap<Integer,Integer> children) {
        if(head==null) return null;
        if(!children.containsKey(horizontalDistance)){
            children.put(horizontalDistance,head.data);
        }
        topView(head.left,horizontalDistance-1,children);
        topView(head.right,horizontalDistance+1,children);
        return children;
    }

    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm = topView(head,0,hm);
        System.out.println(hm);

    }
}
