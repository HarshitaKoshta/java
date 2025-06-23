public class NxtGreater {
    public static void main(String[] args) {
        int[] arr = {2,4,7,3,5,9,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    break;
                }else{
                    arr[i]=-1;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
