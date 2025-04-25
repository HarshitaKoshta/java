class SmallArrEle{
   
    static void arr(){
         int[] a = {11,24,3,7,2};
         int min=100000;
         for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
         }
    } 
    System.out.println(min);
    }    
        public static void main(String[] args) {
        arr();  
    }
}