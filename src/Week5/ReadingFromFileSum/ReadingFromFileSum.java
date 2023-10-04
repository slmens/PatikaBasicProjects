package Week5.ReadingFromFileSum;
import java.io.*;
import java.nio.file.*;

public class ReadingFromFileSum {
    static Integer total = 0;
    public static void main(String[] args) {
        ReadAndAdd();
    }


    public static void ReadAndAdd(){


        // Writing
        fileWriterMethod();


        // Reading
        fileReaderMethod();

    }

    public static void fileReaderMethod(){
        File direct = new File("src/texts");
        File file = new File("src/texts/IntegerFile.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileReader);

            String line = buffReader.readLine();

            while (line != null){
                total += Integer.parseInt(line);
                line = buffReader.readLine();
            }

            fileReader.close();
            buffReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sayıların toplamı: " + total);
    }


    public static void fileWriterMethod(){
        File direct = new File("src/texts");
        File file = new File("src/texts/IntegerFile.txt");


        try {
            if (direct.mkdir()){
                if (file.createNewFile()){
                    fileWriterSubMethod();
                }
            } else if (file.exists()) {
                fileWriterSubMethod();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileWriterSubMethod(){
        String data = "5\n10\n20\n12\n33";
        File direct = new File("src/texts");
        File file = new File("src/texts/IntegerFile.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);

            buffWriter.write(data);

            buffWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
