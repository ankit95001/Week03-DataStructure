package stringbuffer;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] stringArray = {"Ankit", "kumar", "wants", "to", "know."};

        String result = concatenateStrings(stringArray);

        System.out.println(result);
    }

    private static String concatenateStrings(String[] stringArray) {
        StringBuffer sb = new StringBuffer();
        for(String string:stringArray){
            sb.append(string).append(" ");
        }
        return sb.toString();
    }
}
