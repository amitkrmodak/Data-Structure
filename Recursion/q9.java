//Power
public class q9 {
    public static int pow(int num,int power){
        if(power<=0){
            return 1;
        }
        int value = pow(num,power/2);;
        if(power%2==0){

            return value*value;
        }
        return num*value*value;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
