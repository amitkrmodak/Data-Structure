//Transform to sum tree

public class q12 {

    public static int getSumTree(node head){
       if(head == null){
           return 0;
       }
       int leftVal = getSumTree(head.left);
       int rightVal = getSumTree(head.right);
       int data = head.data;
       head.data = (head.left.data + leftVal) +(head.right.data + rightVal);
       return data;
    }

    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);
        head = BT.InsertAtleft(head, 5);

        System.out.println(getSumTree(head));
        System.out.println(getSumTree(head.left));
        System.out.println(getSumTree(head.right));
    }

}
