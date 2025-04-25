class FindMissing{
    static void missing(){
        int[] a ={1,2,4,5,6,7};
        int n=7;
        int sum =0;
        int suma=0;
    
        for (int i = 0; i <=n ; i++) {
            sum+=i;
       }
       System.out.println("sum"+sum);
       for (int i = 0; i < a.length; i++) {
           suma = suma+a[i];
       }
       System.out.println(suma);
       int missing = sum - suma;
       System.out.println("missing"+missing);
    }
    
    public static void main(String[] args) {
        missing();
    }
}