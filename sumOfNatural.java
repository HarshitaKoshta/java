class sumOfNatural{
    static void sumOfNat(int n){
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfNat(7);
    }
}