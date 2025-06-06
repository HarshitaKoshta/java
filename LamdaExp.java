public class LamdaExp {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Runnable using anamous class");
            }
        };
    }
}
