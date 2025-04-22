public class RevFac{
    public static void main(String[] args) {
        int n=24;
        int i;

        for (i = 1; n%i==0; i++) {
            n/=i;
        }
        if(n==1)
          System.out.println(i-1);
        else
          System.out.println("not factorial");
    }
}