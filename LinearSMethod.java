class LinearSMethod{
    static int LinearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {1,5,2,6,9,7};
       int a =  LinearSearch(arr, 7);
       System.out.println("found at index : "+a);
    }
}