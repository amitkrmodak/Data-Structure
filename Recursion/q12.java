//Friends pairing problem

//So formula will be --> totalWays = f(n-1) + (n-1) *f(n-2)
public class q12 {
    public static int findWays(int n){
        if(n <=2 ) return n;

//        Choose to single
        int singleFriend = findWays(n-1);

//        Choose to pair
        int doubleFriend = findWays(n-2);
        int pairWays = (n-1)*doubleFriend;

//        Total ways
        return singleFriend + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(findWays(3));
    }
}
