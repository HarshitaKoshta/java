
import java.util.Arrays;



public class oneSwapSort {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6,5};
        int[] newA = arr.clone();
        Arrays.sort(newA);
        int diff=0;

        for(int i=0;i<arr.length;i++){
            if(newA[i]!=arr[i]){
               diff++;
            }
        }
       if(diff>2){
         System.out.println("not sorted by one swap");
       }else{
        System.out.println("sored by one swap");
       }
    }
}
