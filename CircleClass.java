//Create a class Circle with radius. Write methods to calculate area and circumference of the circle

class Circle{
    int r;
    void area(int r){
        System.out.println("area of circle : "+3.14*r*r);
    }
    void circumference(int r){
        System.out.println("circumference of circle : "+2*3.14*r);
    }
}

class CircleClass{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(3);
        Circle c1 = new Circle();
        c1.circumference(5);
    }
}