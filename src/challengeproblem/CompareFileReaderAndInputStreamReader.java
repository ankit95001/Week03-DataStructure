package challengeproblem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CompareFileReaderAndInputStreamReader {
    public static void main(String[] args) {
        long startTime, endTime, fileReaderTime,inputStreamTime;
        startTime=System.nanoTime();
        try(FileReader file = new FileReader("src/challengeproblem/100mb.txt");
            BufferedReader buffer = new BufferedReader(file)
        ){
            String line;
            while((line= buffer.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        endTime=System.nanoTime();
        fileReaderTime=endTime-startTime;


        startTime=System.nanoTime();
        try(FileInputStream file = new FileInputStream("src/challengeproblem/100mb.txt");
            InputStreamReader inr = new InputStreamReader(file);
            BufferedReader buffer = new BufferedReader(inr)
        ){
            String line;
            while((line= buffer.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        endTime=System.nanoTime();

        inputStreamTime=endTime-startTime;



        System.out.println("Time taken by FileReader for reading 100MB file is "+ fileReaderTime);
        System.out.println("Time taken by Input Stream Reader for reading 100MB file is "+ inputStreamTime);
    }
}
