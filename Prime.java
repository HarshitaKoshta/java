public class Prime{
    public static void main(String[] args) {
        int a = 7;
        boolean isPrime = true;
        for (int i = 2; i*i < 17; i++) {
            if(a%i==0)
            {
                isPrime = false;
          break;
            }
        }
          if(isPrime)
          System.out.println("prime");
          else
          System.out.println("not prime");
    }
}