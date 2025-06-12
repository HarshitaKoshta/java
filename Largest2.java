public class Largest2 {
    public static void main(String[] args) {
        int[]  nums = {1,3,4,6,19};
        int max = -1;
        int smax = -1;
        int maxIdx = 0;

        for(int i = 0; i<nums.length;i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
                maxIdx = i;
            }else if (smax < nums[i]){
                smax = nums[i];
            }
        }

        if(smax*2<=max){
           System.out.println("Largest number at least twice of all found at index: "+maxIdx);
        }else{
          System.out.println("no exits");
        }
    }

}
