//Reverse an array
public class q3 {

    public static void reverseArray(int[] arr, int start,int i) {
        if (start >=arr.length/2-1){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[arr.length-1-start];
        arr[arr.length-1-start] = temp;
        reverseArray(arr, start+1,i);
        i = 5;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0;
        reverseArray(arr, 0,i);
        System.out.println(arr[0]);
        System.out.println(i);
    }
}
