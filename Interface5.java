interface Vehicle{
   default void start(){
         System.out.println("vehicle is starting");
    }
}
class Car implements Vehicle{

}
class Interface5{
    public static void main(String[] args) {
        Car c =new Car();
        c.start();
    }
}

