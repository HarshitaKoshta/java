public class Spiral {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int m =3;
        int n=3;
        int strow = 0, stcol = 0, edrow = m-1,edcol= n-1;

        while(strow<=edrow && stcol<=edcol){
            for(int i = stcol ;i<=edcol;i++){
               System.out.println(mat[strow][i]);
            }
            for(int i = strow+1;i<=edrow;i++){
                System.out.println(mat[strow][edcol]);
            }
            for(int i = edcol-1;i>=stcol;i--){
                System.out.println(mat[edcol][i]);
            }
            for(int i = edrow-1;i>strow;i--){
                if(stcol==edcol)
            }
        }
    }
}
