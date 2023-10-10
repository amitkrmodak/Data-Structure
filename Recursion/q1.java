//n to 1 print in reverse order

public class q1 {
    public void printFunction(int n) {
        if (n<=0) {
            return;
        }
        System.out.println(n);
        printFunction(n-1);
    }
    public static void main(String[] args) {
        q1 q = new q1();
        q.printFunction(5);
    }
}
