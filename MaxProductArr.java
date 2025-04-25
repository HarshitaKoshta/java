public class MaxProductArr{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,4,0};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            for(int j =i+1;j<a.length;j++){
               int c = a[i]*a[j];
               if(c>max){
                max=c;
               }
            }
    }   System.out.println(max);
    }
}    
