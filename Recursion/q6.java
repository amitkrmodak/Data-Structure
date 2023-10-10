//Check if the array is sorted or not

public class q6 {
    public static boolean isSorted(int[] arr,int idx){
        if (idx == arr.length-1)
            return true;
        if (arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0};
        System.out.println(isSorted(arr,0));
    }
}
