package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFileClass {
    public static void main(String[] args) {
        File create = new File("file.txt");
        try{
            create.createNewFile();
            FileWriter startWriting = new FileWriter(create);
            startWriting.write("Where do i find my papers");
            startWriting.write("\nin the cupboard, what number of cupboard");
            startWriting.write( 23);
            startWriting.close();
        }
        catch(IOException c){
            c.printStackTrace();
        }

    }
}
