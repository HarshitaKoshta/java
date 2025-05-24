
import java.util.HashSet;

class DuplicateNumusingHashset{
    public static void main(String[] args) {
        int[] a ={1,2,4,3,4,1,2};
        HashSet<Integer> set = new HashSet<>();

        for(int num:a){
            if(set.contains(num)){
                System.out.println("duplicate element is:"+num);
            }
            set.add(num);
        }
    }
}