package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            String firstLine = reader.readLine();
            return firstLine;
        }catch(IOException e){
            return e.getLocalizedMessage();
        }
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            reader.readLine();
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(line -> stringBuilder.append(line));
            String wholeFile = stringBuilder.toString();
            return wholeFile;
        }catch(IOException e){
            return e.getLocalizedMessage();
        }
    }

}
