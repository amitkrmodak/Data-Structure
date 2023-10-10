//Tiling problem

public class q10 {
    public static int tilingProblem(int n){
//        2 x n in my flore size
        if(n<=1){
            return 1;
        }

//       Vertical choice
        int vertical=tilingProblem(n-1);

//        Horizontal choice
        int horizontal=tilingProblem(n-2);
        int totalWays = vertical + horizontal;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
