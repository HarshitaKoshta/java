class Student{

     Student() {
        System.out.println("hellloooo....");
    }
    Student(int a){
        this();
        System.out.println(a);
    }
    Student(int a,int b){
        this(2);
        System.out.println(a+b);
    }
}

class chainingConst{
    public static void main(String[] args) {
        Student s =new Student(2,3);
    }
}