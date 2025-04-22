public class Strong{
    public static void main(String[] args) {
        int a = 145;
        int b=a;
        int factS=0;

        while(a>0){
            int n = a%10;
            int fac =1;
            for (int i = 1; i <=n ; i++) {
                fac *=i; 
            }
            factS += fac; 
            a=a/10;
        }
        if(factS==b)
            System.out.println("strong num...");
        else
            System.out.println("not strong num..");
    }
}