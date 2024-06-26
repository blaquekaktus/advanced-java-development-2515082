package _06_03.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderExample {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"))){
            String firstLine = reader.readLine();
            System.out.print("First Line: ");
            System.out.println(firstLine);
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(line -> stringBuilder.append(line + " "));
            System.out.println("Rest of the lines:");
            System.out.println(stringBuilder);
        }catch(IOException e){
        e.getLocalizedMessage();
        }
        
    }
}