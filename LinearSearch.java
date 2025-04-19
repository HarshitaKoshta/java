public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        int target = 8;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
          if(arr[i] == target)
            found = true;
        }
        if(found)
        System.out.println(target + " is found ");
        else System.out.println(target + " not is found ");
    }
}