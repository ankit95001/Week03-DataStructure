package day06algorithmruntimeanalysis.largefilereadingefficiency;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class UsingInputStreamReader {

    public void inputStreamReader(String path){
        try(FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            BufferedReader buffer = new BufferedReader(input)){
            String line;
            while((line=buffer.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
