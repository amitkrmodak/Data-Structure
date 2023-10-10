//Find all subsequences of an Array using recursion

import java.util.ArrayList;
import java.util.List;

public class q5 {
//Using recursion
    public static void getSubsequences(int idx, List<Character> list, String str) {
        if(idx == str.length()) {
            System.out.println(list);
            return;
        }
        list.add(str.charAt(idx));
        getSubsequences(idx+1, list, str);
        list.remove(list.size()-1);
        getSubsequences(idx+1, list, str);
    }
    public static void main(String[] args) {
        getSubsequences(0, new ArrayList<>(), "abc");
    }
}
