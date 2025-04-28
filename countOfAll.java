class countOfAll{
    static void count(int n){
     int count =0;
      while(n>0) {
        int num = n%10;
        count++;
        n=n/10;
      }
      System.out.println(count);
    }
    public static void main(String[] args) {
        count(1352254);
    }
}