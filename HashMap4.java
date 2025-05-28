
import java.util.HashMap;

class HashMap4{
    public static void main(String[] args) {
        String str = "aaabdddk";
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
           for(char i :ch){
            map.put(i, map.getOrDefault(i,0)+1);
           }
           for(char i : map.keySet()){
              if(map.get(i)==1){
                System.out.println(i);
                break;
              }
           }
    }
}