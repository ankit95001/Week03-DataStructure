package day06algorithmruntimeanalysis.largefilereadingefficiency;

import java.io.*;

public class UsingFileReader {
    public void fileReader(String path){
        try (FileReader fileReader = new FileReader(path);
            BufferedReader bf = new BufferedReader(fileReader)){

            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
