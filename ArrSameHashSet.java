
import java.util.HashSet;

class ArrSameHashSet{
        static boolean checkEqual(int[] a1,int[] a2){
          HashSet<Integer> set1 = new HashSet<>();
          HashSet<Integer> set2 = new HashSet<>();  

          for(int n:a1){
            set1.add(n);
          }
          for(int n:a2){
            set2.add(n);
          }
          return set1.equals(set2);
 }
    
     public static void main(String args[]){
     int[] a1 = {1,2,3,4};
     int[] a2 = {2,3,1,4};
     boolean result = checkEqual(a1, a2);
       if (result) {
            System.out.println("Both arrays contain the same elements");
        } else {
            System.out.println("Arrays do NOT contain the same elements.");
        }
     }

}