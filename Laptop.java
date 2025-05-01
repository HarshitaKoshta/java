/*Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
 method to display them*/

 class details{
    String brand;
    String RAM;
    int price;
    
    details( String brand,String RAM, int price){
            this.brand = brand;
            this.RAM = RAM;
            this.price = price;
    }

    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("RAM:"+RAM);
        System.out.println("Price:"+price);  
    }
 }

 class Laptop{
    public static void main(String[] args) {
        details d = new details("del", "16GB", 80000);
        d.display();
    }
 }