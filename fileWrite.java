
import java.io.FileWriter;
import java.io.IOException;

public class  fileWrite {

    public static void main(String[] args) {
        try {
            FileWriter fileW = new FileWriter("create.java");
            fileW.write("hello writing in a file");
            fileW.close();
        } catch (IOException e) {
        System.out.println("an error occur");
        }
    }
}


