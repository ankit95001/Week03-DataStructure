package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceOfWord {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/filereader/file.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.equalsIgnoreCase("FileReader")) {
                        count++;
                    }
                }
            }

            System.out.println("\"FileReader\" word appears " + count + " times in file.txt");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
