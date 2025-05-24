class NextGreat{
    public static void main(String[] args) {
        int[] a= {4,5,2,10,7};
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int next = -1;
            for(int j=i+1;j<a.length;j++){
            if(a[j]>a[i]){
             next = a[j];
             break;
            }
            }
            res[i] = next;
        }
      for(int num:res){
        System.out.print(num+" ");
      }
    }
}