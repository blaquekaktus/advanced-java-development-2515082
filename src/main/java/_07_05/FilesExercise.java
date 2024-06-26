package _07_05;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesExercise {

    public static void main(String[] args) {

        Path folderA = Paths.get("src/main/java/_07_05/folderA");
        Path folderB = Paths.get("src/main/java/_07_05/folderB");
        Path fileInA =  Paths.get("src/main/java/_07_05/folderA/example.txt");
        Path fileInB = Paths.get("src/main/java/_07_05/folderB/example.txt");
        try{
        // Create a new empty file called example.txt inside folderA
            //Create new empty FolderA
            if(Files.notExists(folderA)){
                Files.createDirectory(folderA);
            }
            //Create new empty FolderB
            if(Files.notExists(folderB)){
                Files.createDirectory(folderB);
            }
            //Create new File
            if(Files.notExists(fileInB)){
                Files.createFile(fileInB);
            }

        // Copy the file to folderB
            Files.copy(fileInA, fileInB, StandardCopyOption.REPLACE_EXISTING);
            
        // List the contents of folderB to check that your file is in there
            Files.list(folderB)
            .filter(file -> !Files.isDirectory(file))
            .forEach(System.out::println);

        }catch(IOException e){
            System.err.println("Failed to perform file operations: " + e.getLocalizedMessage());
        }
    }


}
