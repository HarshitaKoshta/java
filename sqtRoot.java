class sqtRoot {
   static void mySqrt(int x) {
        if(x<2) System.out.println("square root is:"+x);
        int lt=1,rt=x/2;
        int ans=0;

        while(lt<=rt){
            
            int mid = lt + (rt - lt) / 2;
            long sq = (long)mid*mid;
            if(sq==x){
               System.out.println("square root is:"+mid);
               return;
            }else if(sq<x){
                ans=mid;
                lt=mid+1;
            }else
            rt=mid-1;
        }
       System.out.println("square root is:"+ans);
    }
 public static void main(String[] args) {
        int x =9;
        mySqrt(x);
       }
}