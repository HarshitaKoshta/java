import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File file = new File("create.java");
        if(file.delete()){
            System.out.println("deleted succesfully");
        }else{
            System.out.println("failed to delete");
        }
    }
}
