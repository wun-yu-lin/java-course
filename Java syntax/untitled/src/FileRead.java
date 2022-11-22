import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {


    public static void main(String[] args) {
        File f = new File("word.txt");
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(f+"File not found.");
            throw new RuntimeException(e);
        }

    }
}
