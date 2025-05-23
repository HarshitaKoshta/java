
import java.util.ArrayList;

class MaxSumArrList{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(-2);
        a.add(-4);
        a.add(0);
        a.add(6);
        int max = a.get(0);

       for(int i =0;i<a.size();i++){
           int sum=0;
           for(int j=i;j<a.size();j++){
             sum +=a.get(j);
             if(sum>max){
                max=sum;
             }
           }
       }
       System.out.println(max);
    }
}