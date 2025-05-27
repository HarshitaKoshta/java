
import java.util.ArrayList;
import java.util.Scanner;

class Details{
    private String name;
    private int rollNo;
    private int[] marks = new int[5];

    public Details(String n,int roll,int[] m) {
        this.name = n;
        this.rollNo = roll;
        this.marks = m;
    }
    public int getTotalM(){
        int total =0;
        for(int n:marks){
            total +=n;
        }
        return total;
    }
    public double getPercent(){
       return getTotalM()/5.0;
    }
    public String getGrade(){
        double per = getPercent();
        if(per>=90){ return "A+";
        }else if(per>=80) { return "A";
        }else if(per>=75){ return "B+";
        }else if(per>=70){ return "B";
        }else if(per>=55){ return "C";
        }else return "D";
    }
    public void displayReportCard() {
        System.out.println("\n--- Report Card ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println("\nTotal: " + getTotalM());
        System.out.println("Percentage: " + getPercent() + "%");
        System.out.println("Grade: " + getGrade());
    }
}

class ReportCard {
    static ArrayList<Details> StudentL = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==== Student Report Card Menu ====");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public static void addStudent() {
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Details student = new Details(name, roll, marks);
        StudentL.add(student);
        student.displayReportCard();
      }

    public static void viewAllStudents() {
      for(Details stu : StudentL){
        System.out.println("\n\n\n- - - Studends Report Card are: - - - ");
        stu.displayReportCard();
      }
    }
}
