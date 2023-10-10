//K'th ancestor

public class q11 {
    public static int getKthAncestor(node head,int k,int target){
        if(head == null) return -1;
        if(head.data == target){
            return 0;
        }
        int leftTree=getKthAncestor(head.left,k,target);
        int rightTree = getKthAncestor(head.right,k,target);
        if(leftTree==-1 && rightTree==-1){
            return -1;
        }
        leftTree+=1;
        rightTree+=1;
        if(leftTree==k){
            System.out.println("the "+leftTree +" 'th ancester is "+head.data);
            return leftTree;
        }
        if(rightTree==k){
            System.out.println("the "+rightTree +" 'th ancester is "+head.data);
            return rightTree;
        }
        return Math.max(leftTree,rightTree);
    }


    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);

        getKthAncestor(head,1,4);
    }
}
