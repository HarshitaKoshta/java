
import java.util.ArrayList;
import java.util.HashMap;

class intersection{
    public static void main(String[] args) {
        int[] a1 = {1,2,4,2,5,6};
        int[] a2 = {1,2,5,2,6,7};

        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
      
        for(int i:a1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int n : a2){
            if(map.containsKey(n)&&map.get(n)>0){
                res.add(n);
                map.put(n,map.get(n)-1);
            }
        }
        for(int num:res){
            System.out.println(num);
        }
    }
}