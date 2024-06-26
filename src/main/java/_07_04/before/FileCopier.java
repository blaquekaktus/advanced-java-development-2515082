package _07_04.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopier {

    public static void main(String[] args) {
        Path pathToFile = Paths.get("src/main/java/_07_04/files/a/example.txt");
        Path pathToNewLocation = Paths.get("src/main/java/_07_04/files/b/example.txt");
        try{
            if(Files.notExists(pathToNewLocation)){
                Files.copy(pathToFile, pathToNewLocation, StandardCopyOption.REPLACE_EXISTING);
            }
        }catch(IOException e){
            System.err.println("Failed to copy file: " + e.getLocalizedMessage());
        }

        //Path pathToFile = Paths.get("src/main/java/_07_04/files/a/example.txt");
        //Path destinationDirectory = Paths.get("src/main/java/_07_04/files/b");
        //Path pathToNewLocation = destinationDirectory.resolve("example.txt");

        //try {
            // Create the directory if it does not exist
            //Files.createDirectories(destinationDirectory);

            // Copy the file and overwrite it if it already exists
            //Files.copy(pathToFile, pathToNewLocation, StandardCopyOption.REPLACE_EXISTING);
        //} catch (IOException e) {
            // Print the error message to the console or log it
            //System.err.println("Failed to copy file: " + e.getLocalizedMessage());
        //}
    }

}
