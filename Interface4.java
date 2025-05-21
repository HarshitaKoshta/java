interface Shape{
    void area();
}

class circle implements Shape{
    public void area(){
        System.out.println("area");
    }
}

class Interface4{
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
    }
}