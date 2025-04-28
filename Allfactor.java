/*public class Allfactor{
    static void factor(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        factor(15);
    }
}*/

public class Allfactor{
    static void factor(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
                 sum += i;
            }
           
        }
        System.out.println("sum"+sum);
    }
    public static void main(String[] args) {
        factor(12);
    }
}
