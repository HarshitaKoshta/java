class person{
    void displayName(){
        System.out.println("name is...");
    }
}
class student extends person{
       void displayClass(){
        System.out.println("class: 12");
}
}
class monitor extends person{
    void checkDiscipline(){
        System.out.println("disciplined class...");
    }
}
class multipleInher{
    public static void main(String[] args) {
        student s = new student();
        s.displayName();
        s.displayClass();
         monitor m = new monitor();
         m.checkDiscipline();
         m.displayName();
    }
}