class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class puppy extends Dog{
    void cute(){
        System.out.println("cuteeee");
    }
}

class Inheritance{
    public static void main(String[] args) {
       // Dog obj =  new Dog();
       puppy obj = new puppy();
        obj.bark();
        obj.eat();
        obj.cute();
    }
}