class SwastikPattern{
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j >= n / 2 || // top horizontal line right half
                    j == 0 && i < n / 2 || // left vertical line top half
                    i == n / 2 ||          // middle horizontal line
                    j == n - 1 && i >= n / 2 || // right vertical line bottom half
                    i == n - 1 && j <= n / 2 || // bottom horizontal line left half
                    j == n / 2 && i > 0) {  // middle vertical line lower half
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}