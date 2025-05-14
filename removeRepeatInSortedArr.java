class removeRepeatInSortedArr{
    static void removeReap(int[] a) {
        if (a.length == 0) return;

        int i = 0; 

        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                i++;
                a[i] = a[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4};
        removeReap(a);  
    }
}
