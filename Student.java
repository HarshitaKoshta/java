class info{
    String name;
    int roll;
    int marks;
    void information(){
       System.out.println(name);
       System.out.println(roll);
       System.out.println(marks);   
    }
}
public class Student{
    public static void main(String[] args) {
       info ob1 = new info();
        ob1.name = "pihu";
        ob1.roll = 95;
        ob1.marks = 100;
        ob1.information();

        info ob3 = new info(); 
        ob3.name = "vanshika";
        ob3.roll = 229;
        ob3.marks = 198;
        ob3.information();

       info ob2 = new info(); 
        ob2.name = "damiii";
        ob2.roll = 79;
        ob2.marks = 98;
         ob2.information(); 
    }
}