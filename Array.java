import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
      //  int age =19;
        int[] marks = new int[3];
       marks[1]=89;
       marks[0] = 97;
       marks[2] = 93;

        for (int i = 0; i < marks.length; i++) {
          System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        System.out.println(marks[0]);
            }    
}