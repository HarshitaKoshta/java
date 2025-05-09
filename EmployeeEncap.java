class Employee{
    private int id,salary;
    private String name;

    public void setInfo(int id,int salary,String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
class EmployeeEncap{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setInfo(4, 60000, "harshita");
       System.out.println(e.getId());
       System.out.println(e.getName());
       System.out.println(e.getSalary());
    }
}