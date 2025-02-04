package stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aabbccsddeefdsn";

        String result = removeDuplicate(input);

        System.out.println(result);
    }

    private static String removeDuplicate(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
