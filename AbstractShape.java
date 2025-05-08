abstract class Shape{
      abstract void area();

}

class Circle extends Shape{
    void area(){
        System.out.println("area of circle");
    }
}

class Rectangle extends Shape{
    void area(){
        System.out.println("area of rectangle");
    }
}

class AbstractShape{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
        Shape s1 = new Rectangle();
        s1.area();
    }
}