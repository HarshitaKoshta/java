class employees{
    void work(){
        System.out.println("working..");
    }
}
class manager extends employees{
void attendMeeting(){
        System.out.println("attends meeting");
}
}

class Employee{
    public static void main(String[] args) {
        manager m = new manager();
        m.attendMeeting();
        m.work();
    }
}