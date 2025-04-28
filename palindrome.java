public class palindrome{
    static void palin(int n){
        int rev = 0;
        int b=n;
      while(n>0){
        int num = n%10;
         rev = rev*10+num;
         n/=10;
      }
      if(rev==b){
        System.out.println("palindrome");
      }else
      System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        palin(151);
    }
}