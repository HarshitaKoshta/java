public class TwoDtoOne{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{3,4,5,6},{6,7,8,9}};
        int count = 0;
        
        for(int i =0;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].length;j++){
               count++;
            }   
        }
        
        int[] a = new int[count];
        int k=0;
        for(int i =0;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].length;j++){
               a[k++]=arr[i][j];
            }   
        }
        for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
            
        }
    }
}