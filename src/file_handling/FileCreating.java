package file_handling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreating {
    public static void main(String[] args) {
        // specify the path and file in the file class constructor
        // "try and catch" must be use in creating a file.


        try{
            File newFile = new File("Names.txt");
            newFile.createNewFile();

            //if(newFile.createNewFile()){ //creating and checking if a file exist
               // System.out.println("File " + newFile.getName() + " is being created");
                FileWriter theName = new FileWriter( "Names.txt");
                theName.write("Jacob\n James\n Bulus"); // not in the file...
                theName.close();

            //}
            //else{
            //    System.out.println("file already exist");
            //}

        }catch(IOException e){ // File not in Document folder
            e.printStackTrace(); // checking where the error is coming from.
            System.out.println("file being created");
        }
    }

}
