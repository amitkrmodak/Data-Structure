//Search in a BST

public class q2 {
    public static BinarySearchTree buildBST(BinarySearchTree head,int data) {
        BinarySearchTree temp = new BinarySearchTree(data);
        if (head == null) {
            head = temp;
            return head;
        }
        if(data>head.data){
            head.right = buildBST(head.right,data);
        }else{
            head.left = buildBST(head.left,data);
        }
        return head;
    }
    public static void inorderTraversal(BinarySearchTree head){
        if(head==null) return;
        inorderTraversal(head.left);
        System.out.println(head.data);
        inorderTraversal(head.right);
    }


    //Search method
    public static boolean isPresent(BinarySearchTree head,int value){
        if(head==null) return false;
        if(head.data == value) return true;
        if(head.data>value){
            return isPresent(head.left,value);
        }
        return isPresent(head.right,value);
    }
    public static void main(String[] args) {
        BinarySearchTree head = null;
        int[] arr = {5,1,3,4,2,7};
        for (int i=0;i<arr.length;i++){
            head = buildBST(head,arr[i]);
        }
//        inorderTraversal(head);
        System.out.println(isPresent(head,9));
    }

}
