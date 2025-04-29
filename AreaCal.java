class calculate{
    int l = 20;
    int b = 3;
    void area(){
        System.out.println(l*b);
    }
}
public class AreaCal{
    public static void main(String[] args) {
        calculate obj = new calculate();
        obj.area();
    }
}    
