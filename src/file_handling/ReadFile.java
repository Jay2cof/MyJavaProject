package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File create = new File("File.txt");

            Scanner Reader = new Scanner(create);

            while (Reader.hasNextLine()){
                String lines = Reader.nextLine();
                int line = Reader.nextInt();
                System.out.println(lines);
                System.out.println(line);
            }
            Reader.close();
        }
        catch(IOException c){
            c.printStackTrace();
        }

    }
}
