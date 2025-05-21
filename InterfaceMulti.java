interface cleint1{
    void show();
}

interface cleint2{
    void show();
    void print();
}

class Devp implements cleint1,cleint2{
    public void show(){
        System.out.println("work foe both");
    }
    public void print(){
        System.out.println("for c2");
    }
}

class InterfaceMulti{
    public static void main(String[] args) {
        Devp d = new Devp();
        d.print();
        d.show();
    }
}