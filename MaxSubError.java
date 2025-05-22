class MaxSubError{
    public static void main(String[] args) {
        int[] a = {1,2,-4,5,-6,3,9};
        int max=a[0];
        try {
            for(int i=0;i<a.length;i++){
                int Sum = 0;
                for(int j=i;j<a.length;j++){
                      Sum +=a[j];
                       if(Sum>max){
                max=Sum;
            }
            }
            }   
              System.out.println(max);
        } catch (Exception e) {
            System.out.println("index out of bound");
        }
        System.out.println("helllooo");
    }
}