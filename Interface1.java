interface Walkable{
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("walk");
    }
     public void run(){
        System.out.println("run");
    }
}

class Interface1{
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
}