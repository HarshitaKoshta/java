class sumDigitObj{
    static void sumD(int a){
        int sum =0;
        while(a>0){
        int n = a%10;
        sum += n;
         a = a/10;
        }
         System.out.println(sum);
    }
    public static void main(String[] args) {
        sumD(123);
    }
}