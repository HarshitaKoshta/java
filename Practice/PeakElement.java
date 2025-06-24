public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }

    public static int findPeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Move to the right
                low = mid + 1;
            } else {
                // Move to the left
                high = mid;
            }
        }

        return low; // or high, both will be same
    }
}
