interface cleint{
    void print();
    void show();
}

class Dev implements cleint{
    public void print(){
        System.out.println("hello");
    }
    public void show(){
        System.out.println("bill");
    }
}

class Interface{
    public static void main(String[] args) {
        Dev d = new  Dev();
        d.print();
        d.show();
    }
}