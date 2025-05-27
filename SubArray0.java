
import java.util.HashSet;

class SubArray0{
    public static void main(String[] args) {
        int[] a = {1,2,-4,2,9};
        HashSet<Integer> set = new HashSet<>();
        int sum =0;

        for(int num:a){
         sum+=num;

         if(sum==0||set.contains(sum)){
            System.out.println("subarray present");
         }
        }
    }
}