
public class RevSubArrSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6, 7};
        
        int start = -1, end = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            System.out.println("Array is already sorted.");
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        reverse(arr, start, end);

        if (isSorted(arr)) {
            System.out.println("Yes, the array can be sorted by reversing one subarray.");
        } else {
            System.out.println("No, the array cannot be sorted by reversing one subarray.");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
