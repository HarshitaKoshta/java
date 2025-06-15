
import java.util.HashMap;


public class practice {
    public static void main(String[] args) {
//         String s1 = "listen", s2 = "silet";
//         char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
// Arrays.sort(a1); Arrays.sort(a2);
// if(Arrays.equals(a1, a2)){
//     System.out.println("anagram");
// } // true
// else
//     System.out.println("not anagram");

//     }
// }

// String s  ="aaaabbbnnnn";
// int i =0;
// while(i<s.length()){
//     char currChar = s.charAt(i);
//    int count = 1;
// while(i+1<s.length()&& currChar==s.charAt(i+1)){
//     count++;
//     i++;
// }
// System.out.print(currChar+""+count);
// i++;
// }

int[] a = {1,2,3,31,3,1,2,3,4};

HashMap<Integer,Integer> map = new HashMap<>();

for(int n:a){
    map.put(n, map.getOrDefault(n,0)+1);
}
System.out.println(map);
    }
}

  