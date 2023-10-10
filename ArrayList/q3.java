//Pair sum

public class q3 {
    public static void pairSum(int []arr,int target){
        int leftPointer = 0;
        int rightPointer = arr.length-1;
        while (leftPointer < rightPointer) {
            if(arr[leftPointer]+arr[rightPointer] == target){
                System.out.println(arr[leftPointer]+" "+arr[rightPointer]);
                return;
            }
            if(arr[leftPointer]+arr[rightPointer]>target){
                rightPointer--;
            }else{
                leftPointer++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        pairSum(arr,10);
    }
}
