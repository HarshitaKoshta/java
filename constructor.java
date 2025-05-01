class Student{
    String name;
    int age;
    void details(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    Student(String Name,int Age) {
        this.name = Name;
        this.age = Age; 
    }
}

class constructor{
    public static void main(String[] args) {
        Student s1 = new Student("pihu", 19);
        s1.details();
    }
}