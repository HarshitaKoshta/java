class LCM {
    static int gcdCalcu(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcmCalcu(int a, int b) {
        return (a * b) / gcdCalcu(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmCalcu(a, b));
    }
}
