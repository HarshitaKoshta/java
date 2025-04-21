public class count{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{3,4,5,6},{1,3,5,7}};
        int count =0;

        for(int i =0;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].length;j++){
               count++;
            }
        }
        System.out.println(count);
     }
}
/*
for(int i =0;i<arr.length;i++)
count = count+arr[i].length;
*/
