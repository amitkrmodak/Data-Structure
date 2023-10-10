import java.util.ArrayList;
import java.util.Arrays;

//Sorted array to balanced BST
public class q6 {
    public static BinarySearchTree createBst(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        BinarySearchTree temp = new BinarySearchTree(arr[mid]);
        temp.left = createBst(arr,start,mid-1);
        temp.right = createBst(arr,mid+1,end);
        return temp;
    }

    public static void inorderTraversal(BinarySearchTree head){
        if(head==null) return;
        inorderTraversal(head.left);
        System.out.println(head.data);
        inorderTraversal(head.right);
    }
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println(arr.length);
//        BinarySearchTree head = createBst(arr,0,arr.length-1);
//        inorderTraversal(head);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.sort(Integer::compareTo);
        System.out.println(list.toString());
    }
}
