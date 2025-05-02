class shapes{
    void draw(){
        System.out.println("draw shape");
    }
}
class circle extends shapes{
    void calculateArea(){
    System.out.println("area...");
    }
}
class Shape{
    public static void main(String[] args) {
        circle c =new circle();
        c.calculateArea();
        c.draw();
}
}