public class SquareOfSortedArr {
    public static void main(String[] args) {
        int[] nums = {-8,-4,0,2,5,6};
        int [] ans = new int[nums.length];

        int st =0 ;
        int ed = nums.length-1;
        int ptr = ans.length-1;

        while(st<=ed){
            int ss = nums[st]*nums[st];
            int es = nums[ed]*nums[ed];

            if(ss>es){
                 ans[ptr--]=ss;
                 st++;
            }else{
                ans[ptr--]=es;
                ed--;
            }
        }
        System.out.println("Sorted square of array is:");
        for(int i :ans){
        System.out.print(i+" ");
        }
    }
}
