package Week5.NotePad;
import java.io.*;
import java.util.Scanner;

public class NotePad {
    static Scanner scan = new Scanner(System.in);
    static int userChoice;
    static File file = new File("src/texts/NotePad.txt");
    public static void main(String[] args) {

        /* Program calls fileRead first because I want to see my notes first
           In fileRead method program checks if there are any file that has the file path that i give above
           If there are no files match with that path then method calls fileWrite method
           Program checks file path again and if there are no file in that path then it just create one and calls fileWriterSubMethod
           But if there is a file on that path then it ask us what we want to do. If we type 1 then it calls fireWriterSubMethod
           In fileWriterSubMethod program asks us what to write and store it. After that program writes that data to the file that I want and calls fileRead
         */
        fileRead();
        if (file.exists()){
            fileWrite();
        }
    }


    public static void fileRead(){
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader buffReader = new BufferedReader(fileReader);

                System.out.println("Your latest notes: ");
                String line = buffReader.readLine();

                while (line != null){
                    System.out.println(line);
                    line = buffReader.readLine();
                }
                System.out.println();
                fileReader.close();
                buffReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }else {
            fileWrite();
        }
    }

    public static void fileWrite(){

        if (file.exists()){
            fileWriterSubMethod();
        }else {
            try {
                if (file.createNewFile()){
                    fileWriterSubMethod();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void fileWriterSubMethod(){
        System.out.print("Would you like to write? (If yes 1, If no 2): ");
        userChoice = scan.nextInt();
        scan.nextLine();
        switch (userChoice){
            case 1:
                try {
                    System.out.print("What would you like to write? : ");
                    String data = scan.nextLine();

                    System.out.println();
                    FileWriter fileWriter = new FileWriter(file,true);
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.write(data + "\n");

                    printWriter.close();

                    fileRead();
                } catch (Exception e) {
                    System.out.println(e.getMessage());;
                }
                break;
            case 2:
                System.out.println("Then system is closing...");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter 1 or 2...");
                break;
        }
    }
}
