class MaxValueSum{
    /*static int sum(int a,int b){
        return a+b;
    }*/
    static void max(int a,int b){
        int sum = a+b;
        int maxi =0;
        while(sum>0){
            int n =sum%10;
            if(n>maxi){
                maxi=n;
            }
            sum = sum/10;
        }
        System.out.println(maxi);
    }
    public static void main(String[] args) {
      //  int obj=sum(2,4);
   // System.out.println("sum:"+obj);
    max(26,16);
    }
}