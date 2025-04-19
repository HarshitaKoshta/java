public class UniqueArr{
    public static void main(String[] args) {
        int[] a1 = {1,3,4,2};
        int[] a2 = {1,4,5,6};



        for (int i = 0; i < a1.length; i++) {
            boolean unique = false;
             for(int j = 0 ;j<a2.length;j++){
                if(a1[i]==a2[j]){
                unique = true;
                break;
                }
            }
            if(!unique)
                System.out.println(a1[i]);
        }
        
        for (int i = 0; i < a2.length; i++) {
            boolean unique = false;
             for(int j = 0 ;j<a1.length;j++){
                if(a1[i]==a2[j]){
                unique = true;
                break;
                }
            }
            if(!unique)
                System.out.println(a2[i]);        
        }
    }
}