import java.util.ArrayList;
import java.util.Scanner;

class ToDo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter the choice:\n1. Add\n2. Remove\n3. Show\n4. Exit");
           
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the name:");
                    String n = sc.nextLine();
                    arr.add(n);
                    System.out.println("Name added: " + n);
                    break;

                case 2:
                    if(arr.isEmpty()){
                        System.out.println("no names in the list");
                        break;
                    }
                    System.out.println("Enter number to remove:");
                    int r = sc.nextInt();
                  
                    if (r <= 0 || r > arr.size()) {
                        System.out.println("Invalid index. No such item.");
                    } else {
                        String removed = arr.remove(r - 1);
                        System.out.println("Successfully deleted: " + removed);
                    }
                    break;

                case 3:
                    System.out.println("Names are:");
                    if (arr.isEmpty()) {
                        System.out.println("No names in the list.");
                    } else {
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println((i + 1) + ". " + arr.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
