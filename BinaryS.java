
import java.util.Arrays;

public class BinaryS{
    public static void main(String[] args) {
        int[] arr = {1,3,54,7,45,14};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = 45;
        int st = 0;
        int end = arr.length - 1;

       while(st<=end) {
        int mid = (st+end)/2;
            if(arr[mid]==key){
                System.out.println("found at" +mid);
                break;
            }
            else if(arr[mid]>key){
                end = mid -1;
            }else 
                st=mid+1;
        }
    }
}