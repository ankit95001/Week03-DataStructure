package day05linearsearchandbinarysearch.linearsearch;

public class SearchSpecificWord {
    public static void main(String[] args) {
        String[] sentences = {"let them think what they list",
                "I'll put your name on the list",
                "consult the list of drugs on page 326",
                "the ship has a 35º list to starboard",
                "my new book is at the top of the list of best-sellers",
                "I have little list to write",
                "the list worsened and the ship began to sink",
                "a new car is high on my list of priorities",
                "Filing is going to join the growing list of things I no longer do.",
                "if you're buying a new car, put security high on your list of priorities"};

        String result = searchSpecificWord(sentences,"starboard");

        System.out.println("\"starboard\" is present in : "+result);
    }

    private static String searchSpecificWord(String[] sentences, String target) {
        for(String sentence:sentences){
            String[] words = sentence.split(" ");
            for(String word:words){
                if(word.equalsIgnoreCase(target)){
                    return sentence;
                }
            }
        }
        return "Not Found";
    }
}
