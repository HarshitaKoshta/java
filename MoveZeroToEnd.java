class MoveZeroToEnd{
    static void movezero(int[] arr){
        int idx =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
               arr[idx] = arr[i];
               idx++;
            }
        }
        for(int i =idx;i<arr.length;i++){
            arr[i]=0;
        }
        for(int num:arr){
        System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4};
        movezero(arr);
    }
}