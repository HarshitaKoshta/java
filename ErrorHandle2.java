class ErrorHandle2{
    public static void main(String[] args) {
        int[] a = {1,5,6,7,8};
        try {
            System.out.println(a[7]);
        } catch (Exception e) {
            System.out.println("index is not present is array");
            System.out.println(e);
        }finally{
            System.out.println("all well");
        }
    }
}