
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    int roll;
    String name;

    public Student(int age,int roll,String name) {
       this.age=age;
       this.roll = roll;
       this.name = name;
    }

    public  String toString(){
        return age+ " "+name +" "+roll;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class imp2Sort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(45, 229, "vanshika"));
        list.add(new Student(19, 95, "Harshita"));
        list.add(new Student(20, 78, "Ashi"));
        Collections.sort(list,new SortByName());

        for(Student s:list){
            System.out.println(s.toString());
        }
    }
}
