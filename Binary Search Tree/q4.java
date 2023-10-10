//Root to leaf paths

import java.util.ArrayList;

public class q4 {
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


    //Root to leaf paths
    public static void printPaths(BinarySearchTree head, ArrayList<Integer> list){
        if(head==null){
            System.out.println(list.toString());
            return;
        }
        list.add(head.data);
        printPaths(head.left,list);
        printPaths(head.right,list);
    }
    public static void main(String[] args) {
        BinarySearchTree head = null;
        int[] arr = {5,1,3,4,2,7};
        for (int i=0;i<arr.length;i++){
            head = buildBST(head,arr[i]);
        }
//        inorderTraversal(head);
        printPaths(head,new ArrayList<>());
    }
}
