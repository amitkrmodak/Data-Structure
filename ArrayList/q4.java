//Pairsum in sorted rotated array

public class q4 {
    public static void findPairs(int[] nums, int target) {
        //first we need to find the starting point of the rotation
        int leftPointer=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i+1]<nums[i]){
                leftPointer = i+1;
                break;
            }
        }
        System.out.println(leftPointer);

        //After that
        int rightPointer = leftPointer-1;
        while(rightPointer!=leftPointer){
            if(nums[rightPointer]+nums[leftPointer]==target){
                System.out.println(leftPointer + " " + rightPointer);
                return;
            } else if(nums[rightPointer]+nums[leftPointer]>target){
                rightPointer = (nums.length+rightPointer-1)%nums.length;
            }else {
                if(leftPointer>=nums.length-1){
                    leftPointer = (leftPointer+1)%nums.length;
                }
                leftPointer++;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int []arr = {3,4,5,6,7,0,1,2};
        findPairs(arr,10);
    }
}
