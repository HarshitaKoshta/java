class calculation{
    int l ;
    int b ;
    void area(int l,int b){
          System.out.println("area:"+l*b);
    }
    void paremeter(int l,int b){
        System.out.println("paremeter:"+2*(l+b));
    }
}
class Rectangle{
    public static void main(String[] args) {
        calculation a1 = new calculation();
        a1.area(3,4);
        a1.paremeter(2, 1);
        
    }
}