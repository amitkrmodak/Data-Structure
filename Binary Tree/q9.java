//Lowest Common ancestor

import java.util.ArrayList;
import java.util.List;

public class q9 {
    public static boolean getPath(node root,int targetNode,List<Integer> lst){
        if(root == null) return false;
        if(root.data == targetNode) return true;
        lst.add(root.data);
        boolean leftParent = getPath(root.left,targetNode,lst);
        boolean rightParent = getPath(root.right,targetNode,lst);
        if(leftParent || rightParent){
            return true;
        }
        lst.remove(lst.size() - 1);
        return false;
    }
    public static int getLowestCommonAncestor(node root,int targetNode1,int targetNode2){
        List<Integer> path1 = new ArrayList<Integer>();
        List<Integer> path2  = new ArrayList<Integer>();

        getPath(root,targetNode1,path1);
        getPath(root,targetNode2,path2);
        int i =0;
        for(;i<path1.size() && i<path1.size();i++){
            if(path1.get(i) !=path2.get(i)){
                break;
            }
        }
        if(i==0){
            return path1.get(i);
        }
        return path1.get(i-1);
    }
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);
        System.out.println(getLowestCommonAncestor(head,2,5));
    }
}
