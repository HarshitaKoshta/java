class threeConsOdd{
    static void checkOdd(int[] arr){
        int count =0;
    for (int num : arr) {
            if (num % 2 != 0) {
                count++;
                if (count == 3) {
                   System.out.println("three consecutive odd present");
                }          
            } else {
                count = 0;
            }
    }
 }         
public static void main(String[] args) {
    int[] arr = {1,2,7,5,8,9};
     checkOdd(arr);
}
}
