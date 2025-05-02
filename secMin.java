public class secMin{
    public static void main(String[] args) {
        int[] arr ={11,33,4,54,2,6,9};
        int mini =1000;
        int secondMini =1000;
         
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                secondMini = mini;
                mini=arr[i];
            }
        }
System.out.println("second mini"+secondMini);
    }
}