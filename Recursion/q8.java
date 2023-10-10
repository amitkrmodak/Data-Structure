

//Find last occurrence
public class q8 {
    public static int findLastOccurrence(int[] arr,int idx,int num){
        if (idx>=arr.length){
            return -1;
        }
        int occ= findLastOccurrence(arr,idx+1,num);
        int occ2 = 0;
        if(arr[idx]==num){
            occ2= idx;
        }
        return Math.max(occ,occ2);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,4,2,3,4,3};
        System.out.println(findLastOccurrence(arr,0,3));
    }
}
