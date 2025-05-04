class sumAlternate{
    public static void main(String[] args) {
        int n =123312;
        int s =0;
           while(n>0){
            int a = n%10;
             s = s+a;
             n = n/100;
           }
        System.out.println("sum:"+s);
    }
}