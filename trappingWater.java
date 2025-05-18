class trappingWater {
    static void trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lMax = height[l];
        int rMax= height[r];
        int ans = 0;

        while(l<r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                ans += lMax - height[l];
            }

            else{
                r--;
                rMax = Math.max(rMax, height[r]);
                ans += rMax - height[r];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] height = {2,6,3,7,3,7,8};
        trap(height);
    }
}