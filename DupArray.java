
import java.util.Arrays;

public class DupArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,4,7};
        Arrays.sort(arr);
        for (int i = 1; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i-1]){
                if(arr[i]!=arr[i-2]){
System.out.println(arr[i]);
                }
            }
        }
    }
}