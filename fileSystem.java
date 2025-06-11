
import java.io.File;
import java.io.IOException;

public class fileSystem {
    public static void main(String[] args) {
        try {
            File file = new File("create.java");
            if(file.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("already exists");
            }
        } catch (IOException e) {
        System.out.println("an error occur");
        }
    }
}
