//Fibonacci series using recursion

public class q4 {

    public static int findFibonacci(int num){
        if(num>=1){
            return num;
        }
        int firstNumber = findFibonacci(num+1);
        int secondNumber = findFibonacci(num+2);
        return firstNumber+secondNumber;
    }
    public static void main(String[] args) {
        System.out.println(findFibonacci(3));
    }
}
