class temprature{
    private int celsius;
    public void setTemp(int celsius){
        this.celsius=celsius;
         
    }
    public double getTemp(){
         return ((celsius* ((float)9/5))+32);
    }
}
class Temperature{
    public static void main(String[] args) {
        temprature t =new temprature();
        t.setTemp(30);
        System.out.println(t.getTemp());
    }
}