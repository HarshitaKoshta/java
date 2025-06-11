
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class readFile {
   
     public static void main(String[] args) {
        try {
            File file = new File("create.java");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
        System.out.println("an error occur");
        }
    }
}


