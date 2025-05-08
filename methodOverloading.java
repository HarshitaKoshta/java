class math{
    void print(){
        System.out.println("calculate");
    }
}
class printNum extends math{
    void print(int a){
        System.out.println(a);
    }
}
class add extends math{
    void print(int a,int b){
        System.out.println("a&b:"+a+" "+b);
    }
}
class methodOverloading{
    public static void main(String[] args) {
        printNum p =new printNum();
        p.print();
        p.print(3);
        add a = new add();
        a.print(2,5);
    }
}