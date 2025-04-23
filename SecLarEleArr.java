public class SecLarEleArr{
    public static void main(String[] args) {
        int[] arr ={11,33,4,54,2,19};
        int max =0;
        int secondMax =0;
         
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max=arr[i];
            }
        }
System.out.println("second max"+secondMax);
    }
}