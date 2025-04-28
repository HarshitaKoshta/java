class HarshadNum{
    static void HarshadNumCal(int n){
        int b=n;
        int s = 0;
        while(n>0){
            int num = n%10;
            s += num;
            n /=10;
        }
        if(b%s==0){
            System.out.println("harshad number");
        }else
        System.out.println("not");
    }
    public static void main(String[] args) {
        HarshadNumCal(18);
    }
}