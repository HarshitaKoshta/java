public class multiNNatural{

    static void mulOfNat(int n){
        int mul =1;
        for (int i = 1; i <= n; i++) {
            mul *=i;
        }
        System.out.println(mul);
    }
    public static void main(String[] args) {
        mulOfNat(3);
    }
}
