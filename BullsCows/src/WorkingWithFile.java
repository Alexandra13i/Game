import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WorkingWithFile {
    public static String file1= "/Users/vladelec/Documents/bulls.txt";
    public static int number=1;
    public static void main(String[] args) throws IOException {
        ReadingFromFile();
    }

    public static void CreatingFile(){
        try {
            File file = new File(file1);
            file.createNewFile();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void ReadingFromFile() throws IOException {
        Path file = Paths.get(file1);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext()){
            scanner.useDelimiter(" ");
        }
        while (scanner.hasNext()){
            String str=scanner.next();
            if (str.contains("№")){
                number = Integer.parseInt(str.substring(1));
                number++;
            }
        }
    }
    public static String WritingToFile(String text) {
        try {
            FileWriter writer = new FileWriter(file1,true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
