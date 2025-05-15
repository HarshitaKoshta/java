class posNeg{
    static void arrange(int[] a){
        int l=0,h=a.length-1;
        while(l<h){
            if(a[l]>0){
                l++;
            }else if(a[h]<0){
                h--;
            }else{
                int temp = a[l];
                a[l] = a[h];
                a[h] = temp;
            }
        }
        for(int num:a){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,-2,-3,4,5};
        arrange(a);
    }
}