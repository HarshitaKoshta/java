public class Greater3 {
    
    public static void main(String[] args) {
        int[] nums = {1,7,6,7,8,9};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; //1 7<=1 
            } else if (num <= second) {
                second = num; 
            } else {
              System.out.println("Triplet of element a<b<c: " + first + ", " + second + ", " + num);
                break;
            }
        }
        
    }
}

