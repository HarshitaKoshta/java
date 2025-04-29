class student{
        String firstName="harshita";
        String lstName = "Koshta";
        void fullName(){
            System.out.println(firstName+" "+lstName);
        }
}
public class objClass{
    public static void main(String[] args) {
        student obj = new student();
        obj.fullName();
    }
}