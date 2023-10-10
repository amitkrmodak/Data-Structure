//Delete node

public class q3 {
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
    //Searching the node in th tree
    public static BinarySearchTree search(BinarySearchTree head,int target){
        if(head==null) return null;
        if(head.data == target){
            return head;
        }
        if(head.data>target){
            return search(head.left,target);
        }
        return search(head.right,target);
    }


    //Code of inorderSuccessor
    public static BinarySearchTree inorderSuccessor(BinarySearchTree head){
        while (head.left!=null){
            head=head.left;
        }
        return head;
    }
    //Delete node
    public static BinarySearchTree delete(BinarySearchTree head,int target){
        if(head==null) return null;
        if(head.data>target){
            head.left = delete(head.left,target);
        }
        else if(head.data<target){
            head.right = delete(head.right,target);
        }
        else{
            //case 1: delete leaf node
            if(head.left == null && head.right==null){
                return null;
            }
            //case 2: only one child node
            if(head.left==null){
                return head.right;
            }else if (head.right==null){
                return head.left;
            }

            //case 3: 2 child nodes --> first need to find InorderSuccessor
            BinarySearchTree temp = inorderSuccessor(head.right);
            head.data = temp.data;
            head.right = delete(head.right,temp.data);
        }
        return head;
    }
    public static void main(String[] args) {
        BinarySearchTree head = null;
        int[] arr = {5,1,3,4,2,7};
        for (int i=0;i<arr.length;i++){
            head = buildBST(head,arr[i]);
        }

        head = delete(head,2);
        inorderTraversal(head);
    }
}
