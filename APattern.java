class APattern{
    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==0||j==4||(j>0&&j<4&&i==0)||(i==3&&j>0&&j<4)){
                    System.out.print("*");
                }else
              System.out.print(" ");
            }  System.out.println();
        }
        
    }
}