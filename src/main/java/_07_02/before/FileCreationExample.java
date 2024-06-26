package _07_02.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreationExample {

    public static void main(String[] args) {
        try{
        Path path = Paths.get("src/main/java/_07_02/example.txt");
        if(Files.notExists(path)){
            Files.createFile(path);
        }
        }catch(IOException e){
            e.getLocalizedMessage();
        }

    }

}
