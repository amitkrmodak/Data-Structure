import java.util.Stack;

public class ReverceAString {

    public static void main(String[] args) {
        String str = "hello";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        str="";
        while (!stack.empty()){
            str+=stack.pop();
        }
        System.out.println(str);
    }
}
