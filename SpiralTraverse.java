import java.util.Scanner;
class SpiralTraverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int srow = 0, scol = 0, erow = m - 1, ecol = n - 1;
        

        System.out.println("enter elements");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
            mat[i][j]=  sc.nextInt();  
            }
        }

        while (srow <= erow && scol <= ecol) {
            for (int j = scol; j <= ecol; j++) {
               System.out.print(mat[srow][j]); 
            }
            for (int i = srow + 1; i <= erow; i++) {
               System.out.print(mat[i][ecol]);
            }
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) break;
                System.out.print(mat[erow][j]);
            }
            for (int i = erow - 1; i > srow; i--) {
                if (scol == ecol) break;
                System.out.print(mat[i][scol]);
            }
            srow++; erow--; scol++; ecol--;
        }
        
    }
};

