import java.time.LocalDate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

        TaskService service=new TaskService();
        
       while(true){
        System.out.println("\n====== TASK TRACKER ======");
        System.out.println("1. ADD Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                    System.out.print("Enter Title: ");
                    String title=sc.nextLine();
                    System.out.print("Enter Priority: ");
                    String priority=sc.nextLine();
                    System.out.print("Enter deadline (yyyy-mm-dd): ");
                    LocalDate deadline=LocalDate.parse(sc.nextLine());
                    Task task=new Task(title, priority, deadline);
                    service.addTask(task);
                    break;
            case 2:
                    service.viewTasks();
                    break;
            case 3: 
                    System.out.print("Enter Task id: ");
                    int completedid=sc.nextInt();
                    service.markComplete(completedid);
                    break;
            case 4: 
                    System.out.print("Enter Task id: ");
                    int deleteid=sc.nextInt();
                    service.deleteTask(deleteid);
                    break;
            case 5: 
                    System.out.println("Exiting.....");
                    System.exit(0);
            default:
                    System.out.println("Invalid Choice");
        }

    }
  }
 }