public class MoreRepeatCh{
    public static void main(String[] args) {
        String s = "heeeeeeelllloooooooooo";
        char[] a = s.toCharArray();
        int max =0;
        char most = 'a';

        for (int i = 0; i < a.length; i++) {
            int count =0;
            for(int j =i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
                if(count>max){
                    max=count;
                    most=a[i];
                }
            }
        }
        System.out.println(most);
         
    }
}