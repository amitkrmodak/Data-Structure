//FInd first occurrence
public class q7 {
    public static int findFirstOccurance(int[] arr,int idx,int num){
        if (idx>=arr.length){
            return -1;
        }
        if(arr[idx]==num){
            return idx;
        }
        return findFirstOccurance(arr,idx+1,num);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,4,2,3,4,3};
        System.out.println(findFirstOccurance(arr,0,3));
    }
}
