class matrix{
    boolean Search(int[][] mat,int target){
         int m = mat.length;
         int n =mat[0].length;
         int srow = 0;
         int erow = m-1;
        
         while(srow<=erow){
            int midrow = (srow+erow)/2;
            if(target>=mat[midrow][0]&& target<=mat[midrow][n-1]){
                int st=0,end=n-1;
                   while(st<=end){
                      int mid = (st + end)/2;
                      if(target== mat[midrow][mid]){
                        System.out.println("target found at " +midrow+" "+mid);
                        return true;
                      }else if(target>mat[midrow][mid]){
                        st = mid +1;
                      }else {
                        end =mid-1;
                      }
                   }
                   return false;
            }
            else if(target>mat[midrow][n-1]){
                srow = midrow+1;
            }else{
                erow = midrow-1;
         }
         }
         System.out.println("target not found");
        return false;
}
};

class SearchIn2DSortMat{
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{5,6,7},{8,9,10}};
        matrix m = new matrix();
        System.out.println(m.Search(mat, 5));
    }
}