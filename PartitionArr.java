
import java.util.Arrays;

class PartitionArr{
    static void partition(int[] a){
     Arrays.sort(a);
     int sum = 0;
     for (int i = 0; i < a.length; i+=2) {
      sum += a[i];   
     }
     System.out.println(sum);
      }
    public static void main(String[] args) {
        int[] a = {1,2,5,3,6,9};
        partition(a);
    }
}
