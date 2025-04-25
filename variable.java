class variable{
  static int a = 2;
  int b =6;
    public static void main(String[] args) {
        variable obj = new variable();
        System.out.println(obj.b);
        System.out.println(variable.a);
    }
}