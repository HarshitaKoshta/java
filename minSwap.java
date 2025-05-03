public class minSwap{
    public static void main(String[] args) {
        int[] arr ={1,4,3,5,7};
               int mini=arr[0];
               int secMin = arr[0];
     
        for (int i = 0; i < arr.length; i++) {
                 if(arr[i]<mini) {
                 mini =arr[i];
            }
        }
        System.out.println("minimum :"+mini);
        System.out.println("sec minimum :"+secMin);
    }
}