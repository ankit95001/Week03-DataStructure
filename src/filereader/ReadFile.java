package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("src/filereader/file.txt");
            BufferedReader bf = new BufferedReader(fileReader);

            String line;

            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
