class car{
    String brand;
    String color;
    int price;
   car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    void display(){
        System.out.println("brand:"+brand);
        System.out.println("color:"+color);
        System.out.println("price:"+price);
    }
    car(car c2){
        this.brand = c2.brand;
        this.color = c2.color;
        this.price = c2.price;
    }    
    
}

class copyConst{
    public static void main(String[] args) {
         car c1 = new car("BMW", "Blue", 450000); 
         car c2 = new car(c1); 

        System.out.println("Original Car:");
        c1.display();

        System.out.println("Copied Car:");
        c2.display();

    }
}