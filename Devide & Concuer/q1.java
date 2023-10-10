// Merge sort

import java.util.Arrays;

public class q1 {

    public static void merge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int st = start;
        int md = mid + 1;
        int i = 0;
        while (st <= mid && md <= end) {
            if (arr[st] < arr[md]) {
                temp[i] = arr[st];
                st++;
            } else {
                temp[i] = arr[md];
                md++;
            }
            i++;
        }
        while (st <= mid) {
            temp[i] = arr[st];
            i++;
            st++;
        }
        while (md <= end) {
            temp[i] = arr[md];
            i++;
            md++;
        }


        //Copy temp to original array
        for (int j = 0; j < temp.length; j++) {
            arr[start + j] = temp[j];
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
