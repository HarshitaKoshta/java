
import java.util.HashSet;

public class LongestConcecutive {
    public static void main(String[] args) {
        int[] a = {12,2,34,1,3,5,41,4};
        HashSet<Integer> set = new HashSet<>();
        int longest=0;

        for(int num:a){
            set.add(num);
        }

        for(int num:a){
            if(!set.contains(num-1)){
              int current = num;
              int count =1;
           
            while(set.contains(current+1)){
                count++;
                current++;
            }
             longest = Math.max(longest, count);
            }
        }
        System.out.println("longest consecutive is of length:"+longest);
    }
}
