//Remove duplicates in a String

public class q11 {
    public static StringBuilder removeDuplicate(String s,int idx,StringBuilder stringBuilder) {
        if(idx == s.length())
            return stringBuilder;
        String str = s.substring(0,idx);
        char ch = s.charAt(idx);
        if (!str.contains(String.valueOf(ch))) {
            stringBuilder.append(String.valueOf(ch));
        }
        return removeDuplicate(s,idx+1,stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("abcccdefghe",0,new StringBuilder()));
    }
}
