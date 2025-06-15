
import java.util.HashMap;

public class FirstNonRep {
    public static void main(String[] args) {
        int[] a = {1,3,4,9,1,6,5,3,9};
     HashMap<Integer,Integer> map = new HashMap<>();

     for(int n:a){
        map.put(n, map.getOrDefault(n, 0)+1);
     }
     for(int n:a){
        if(map.get(n)==1)
{
    System.out.println(n);
    break;
}     }
    }
}
