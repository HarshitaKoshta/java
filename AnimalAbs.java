abstract class animal{
    abstract void sound();
}

class Dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("meowwww....");
    }
}

class AnimalAbs{
    public static void main(String[] args) {
        animal d = new Dog();
        d.sound();
        animal c = new cat();
        c.sound();
    }
}