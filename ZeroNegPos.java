class ZeroNegPos{
    static void arrange(int[] a){
        int[] newArr = new int[a.length];
        int idx=0;
        for(int i = 0; i< a.length;i++){
            if(a[i]==0){
                newArr[idx++] = a[i];
            }
        }
        for(int i = 0; i< a.length;i++){
            if(a[i]<0){
                  newArr[idx++] = a[i];
            }
        }
        for(int i = 0; i< a.length;i++){
            if(a[i]>0){
                  newArr[idx++] = a[i];
            }
        }
        
   for(int num : newArr){
   System.err.print(num+" ");
}
    }
    public static void main(String[] args) {
        int[] a = {1,-3,6,0,-4,8,0,-6};
        arrange(a);
    }
}