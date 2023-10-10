//maximum water storage in a container

import java.util.ArrayList;
import java.util.List;

public class q2 {
    public int maxArea(int[] height) {
        if(height.length==0){
            return 0;
        }
        int front=0;
        int back=height.length-1;
        int max=0;
        List<Integer> temp=new ArrayList<Integer>();
        while(front<back){
            int length = Math.min(height[front],height[back]);
            int width = back-front;
            int area = length*width;
            if(area>max){
                max=area;
                if(!temp.isEmpty()){
                    temp.clear();
                }
                temp.add(height[front]);
                temp.add(height[back]);
            }
            //Update pointers
            if(height[front]<height[back]){
                front++;
            }else {
                back--;
            }

        }
        System.out.println("two points are "+ temp);
        return max;
    }

    public static void main(String[] args) {
        q2 q = new q2();
        int[] height = {1,8,50,2,5,4,8,3,99};
        System.out.println(q.maxArea(height));
    }
}
