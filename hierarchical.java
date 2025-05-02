class Animal{
    void eat(){
        System.out.println("eat");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class cat extends Animal{
    void sleep(){
        System.out.println("cat sleep");
    }
}

class hierarchical{
    public static void main(String[] args) {
        dog d =new dog();
        d.bark();
        d.eat();
        cat c= new cat();
        c.sleep();
        c.eat();
    }
}