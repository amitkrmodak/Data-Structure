//Binary string problem
//Print all binary strings of size n without consecutive ones


public class q13 {
    public static void printBianryString(int n,int lastPlace,String str) {
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            //put 0 in last place now
            lastPlace=0;
            printBianryString(n-1,lastPlace,str+lastPlace);
            //put 1 in last place now
            lastPlace=1;
            printBianryString(n-1,lastPlace,str+lastPlace);
        }
        //It means 1 is present in last place
        else{
            lastPlace=0;
            printBianryString(n-1,lastPlace,str+lastPlace);
        }
    }

    public static void main(String[] args) {
        printBianryString(5,1,"");
    }
}
