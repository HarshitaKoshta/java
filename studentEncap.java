class Student{
    private String name;
    private int marks;
    public void setInfo(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public int getInfo(){
        System.out.println(name);
        return marks;
    }
    public void printInfo(){
        System.out.println(name);
         System.out.println(marks);
    }
}
class studentEncap{
    public static void main(String[] args) {
        Student s =new Student();
        s.setInfo("pihu", 87);
        System.out.println(s.getInfo());
        s.printInfo();
    }
}