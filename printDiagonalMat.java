class printDiagonalMat{
    static void matrix(int[][] a){
       for (int i = 0; i < a.length; i++) {
          System.out.print(a[i][i]);
    }
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,5},{24,45,6}};
        matrix(a);
    }
}