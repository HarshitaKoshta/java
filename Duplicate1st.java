
import java.util.HashSet;

class Duplicate1st{
    public static void main(String[] args) {
        int[] arr ={2,1,23,4,1,2};
        HashSet<Integer> set = new HashSet<>();

        for(int n:arr){
          if(set.contains(n)){
            System.out.println(n);
            break;
        }
       set.add(n);
      }
    }
}