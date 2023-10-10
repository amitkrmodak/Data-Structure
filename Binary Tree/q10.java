import java.util.ArrayList;
import java.util.List;

//Minimum distance between 2 nodes
public class q10 {

    public static boolean getPath(node head,int targetNode,List<node> pathOfNodes) {
        if(head==null) return false;
        if(head.data==targetNode){
            return true;
        }
        pathOfNodes.add(head);
        boolean isPresentInLeft = getPath(head.left,targetNode,pathOfNodes);
        boolean isPresentInRight = getPath(head.right,targetNode,pathOfNodes);

        if(isPresentInLeft || isPresentInRight){
            return true;
        }

        pathOfNodes.remove(pathOfNodes.size()-1);
        return false;
    }

    public static List<node> findTheShortestpath(node head, int targetNode1, int targetNode2){
        List<node> list1 = new ArrayList<node>();
        List<node> list2 = new ArrayList<node>();
        getPath(head.left,targetNode1,list1);
        getPath(head.right,targetNode2,list2);

        int i = 0;
        for (;i<list1.size() && i<list2.size() ; i++) {
            if(list1.get(i)!=list2.get(i)){
                break;
            }
        }
        List<node> ansList = new ArrayList<node>();
        ansList.add(list1.get(i-1));
        int j = i;
        for (; j < list2.size() && j< list1.size(); j++) {
            ansList.add(list1.get(j));
            ansList.add(list2.get(j));
        }
        int counter = j;
        while (counter<list1.size()){
            ansList.add(list1.get(counter));
            counter++;
        }
        while (j< list2.size()){
            ansList.add(list2.get(j));
            j++;
        }
        return ansList;
    }


    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);

        List<node> list = findTheShortestpath(head,4,5);
        for (node n:list) {
            System.out.println(n.data);
        }
    }
}
