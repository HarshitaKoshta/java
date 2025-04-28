class EvenNo{
    static void even(int a,int b){
      for(int i=a;i<=b;i++){
        if(i%2==0){
            System.out.println(i);
        }
      }

    }
    public static void main(String[] args) {
        even(1,10);
    }
}