class info{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
}
class polymor{
    public static void main(String[] args) {
        info i = new info();
        i.name = "pihu";
        System.out.println("name:"+i.name);
    }
}