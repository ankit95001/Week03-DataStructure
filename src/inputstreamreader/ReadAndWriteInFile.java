package inputstreamreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadAndWriteInFile {
    public static void main(String[] args) {
        try(
                InputStreamReader input = new InputStreamReader(System.in);
                BufferedReader buffer = new BufferedReader(input);
                FileWriter writer = new FileWriter("src/inputstreamreader/output.txt");
                ){
                    String line;
                    System.out.println("write \"exit\" when you are done : ");
                    while(!(line=buffer.readLine()).equalsIgnoreCase("exit")){
                        writer.write(line+System.lineSeparator());
                    }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}