 /*Create a class Car with fields brand, model, and price. Write a method to display car details.
 Create multiple objects and display info.*/
class car{
    String brand;
    String color;
    int price;
    
    void display(){
        System.out.println("brand:"+brand);
        System.out.println("color:"+color);
        System.out.println("price:"+price);
    }
}
class CarObj{
    public static void main(String[] args) {
        car c1 =new car();
        c1.brand="Fortuner";
        c1.color = "black";
        c1.price = 500000;
        c1.display();

        car c2 =new car();
        c2.brand="4x4";
        c2.color = "black";
        c2.price = 100000;
        c2.display();
    }
}