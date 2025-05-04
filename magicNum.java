class magicNum{
    public static void main(String[] args) {
        int n =5415;
        int ss =0 ;
        while(n>9){
            int s =0;
            while(n>0){
                s +=n%10;
                n /=10;
            }
            n=s;
        }
        System.out.println(n);
        if(n==1){
            System.out.println("magic number");
        }else
        System.out.println("not magic number");
    }
}