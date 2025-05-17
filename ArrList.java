
import java.util.ArrayList;

class ArrList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(1);

        list.add(1,4);

        list.set(3,8);
        list.remove(2);

        System.out.println(list);

       int ele= list.get(2);
        System.out.println(ele);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}