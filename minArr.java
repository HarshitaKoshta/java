public class minArr{
    public static void main(String[] args) {
        int mini = 1000;
        int[] arr = {4,5,6,0,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        } 
        System.out.println("mini:"+mini);
    }
}