public class MultiThread5 {
    public static void main(String[] args) {
        System.out.println("seeeee");
        Thread t1 = new Thread( ()->{
            System.out.println("hello");
        });
       Thread t2 = new Thread( ()->{
            System.out.println("hiiiiii");
        });
        t1.start();
        t2.start();
      }
}
