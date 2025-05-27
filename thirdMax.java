class thirdMax{
    public static void main(String[] args) {
        int[] a ={3,14,4,33,84,23,8,30};
        int maxi=0,secmax=0,thirdMax=0;

        for(int i =0;i<a.length;i++){
             if(a[i]>maxi){
               thirdMax=secmax;
                secmax=maxi;
                maxi=a[i];
                
             }else if (a[i] > secmax && a[i] != maxi) {
                thirdMax=secmax;
                secmax = a[i];
            }else if (a[i] > thirdMax && a[i] != secmax && a[i] != maxi) {
                thirdMax = a[i];
            }
        }
        System.out.println("first max:"+maxi);
        System.out.println("sec max:"+secmax);
        System.out.println("third max:"+thirdMax);
    }
}