import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        System.out.println("hello");
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3333);
        arr.add(90);
        arr.add(3);
        arr.add(4);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    }
}
