import java.util.Iterator;
import java.util.Stack;

public class Stock_Span_problem {

    public static void stackSpan(Integer[] stock,Integer[] span){
        Stack<Integer> stack = new Stack<>();
        span[0]=1;
        stack.push(0);
        for (int i = 1; i <stock.length ; i++) {
            while (!stack.isEmpty() && stock[i]>stock[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }

    }
    public static void main(String[] args) {
        Integer[] stock= {100,80,60,70,60,85,100};
        Integer[] span = new Integer[stock.length];
        stackSpan(stock,span);
        for (Integer i :span) {
            System.out.println(i);
        }

    }
}
