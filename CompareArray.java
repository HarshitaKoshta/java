public class CompareArray{
    public static void main(String[] args) {
        int[] a1= {2,4,5};
        int[] a2 = {2,4,5};

        for(int i =0 ;i<a1.length;i++){
          if (a1[i]!=a2[i]){
            System.out.println("not same elements");
            return;
          }
        }
        System.out.println("same");
    }
}