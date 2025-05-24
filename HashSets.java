

import java.util.HashSet;

class HashSets{
    public static void main(String[] args){
     HashSet<Integer> set = new HashSet<>();

     set.add(2);
     set.add(5);
     set.add(3);
     set.add(6);

     set.remove(6);

    if(set.contains(6)){
        System.out.println("contains");
    }
  System.out.println(  set.size());

     System.out.println(set);
    }                                     
}