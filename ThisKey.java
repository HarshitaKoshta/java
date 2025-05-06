class Main{
    int a =10;
    Main(int a){
       this.a=a; 
    }
    void write(){
        System.out.println(a);
    }
}  
class ThisKey{  
    public static void main(String[] args) {
        Main k= new Main(9);
       k.write(); 
    }
}