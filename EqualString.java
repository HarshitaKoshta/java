class EqualString{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String(s1);
        if(s1==s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        System.out.println(s1.equals(s3));
    }
}