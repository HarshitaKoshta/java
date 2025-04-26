class MethodEven{
         static boolean isEven(int n){
            return n % 2 == 0;
        }
    public static void main(String[] args) {
      boolean result = MethodEven.isEven(5);
      System.out.println("is even:"+result);
    }
}