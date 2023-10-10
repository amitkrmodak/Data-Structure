import java.util.Stack;

public class PushAtTheBottomOfStack {
    public static void pushAtEnd(Stack<Integer> stack,int num){
        if (stack.isEmpty()){
            stack.push(num);
            return;
        }
        int n = stack.pop();
        pushAtEnd(stack,num);
        stack.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtEnd(stack,4);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());

    }
}
