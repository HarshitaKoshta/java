public class PerfectNum{
    static void PerfectNoCal(int n){
        int sum =0;
        for(int i =1; i<n;i++){
            if(n%i==0){
                System.out.println(i);
                 sum +=i;
            } 
        }
      // System.out.println(sum+ ""+n);
        if(sum == n){
            System.out.println("perfect number");
        }else
        System.out.println("not perfect number");
    }
    public static void main(String[] args) {
        PerfectNoCal(6);
    }
}