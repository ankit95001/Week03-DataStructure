package stringbuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");

        sb.reverse();

        System.out.println("Reverse is : "+sb);
    }
}
