//Subset of a string

public class q1 {
    public static void printSubsets(String str,String printStr,int idx){
        if(idx>=str.length()){
            System.out.println(printStr);

            return;
        }
        //Choose to add char
        printSubsets(str,printStr+str.charAt(idx),idx+1);

        //Choose to remove char
        printSubsets(str,printStr,idx+1);
    }

    public static void main(String[] args) {
        printSubsets("abc","",0);
    }
}
