import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userMessage = """
                Enter "add" to add task
                Enter "show" to show task
                Enter "update" to update task
                Enter "delete" to delete task
                Enter "quit" to quit application :
                """;

        String userInput; // add, delete, show,update
        List<String> tasks = new ArrayList<>();

       do {
            System.out.print(userMessage);
            userInput = sc.nextLine();

            switch(userInput)
           {
               case "add": // add-->tasks
                   System.out.println("Adding......");
                   // taking task as input
                   String newTask;
                   System.out.print("Enter the task :");
                   newTask = sc.nextLine();

                   tasks.add(newTask);
                   System.out.println("TASK ADDED SUCCESSFULLY..");
                   break;
               case "delete":
                   System.out.println("Deleting......");
                    int index;
                   System.out.print("Enter the number of task which you want to delete: ");
                   index = sc.nextInt() - 1;
                   sc.nextLine(); // to fix the skip error
                   tasks.remove(index);
                   System.out.println("TASK DELETED SUCCESSFULLY!");
                   break;
               case "show":
                   System.out.println("Showing......");
                   int count = 1;
                   for(String task : tasks)
                   {
                       System.out.println( count + ". " +task);
                       count++;
                   }
                   System.out.println("ALL TASKS PRINTED SUCCESSFULLY!!");
                    break;
               case "update": // newTask---> input aur index----> jiski value new change se change karni hai.
                   System.out.println("Upating......");
                   int indexOfUpdate;
                   System.out.print("Enter the task number which you want to update : ");
                   indexOfUpdate = sc.nextInt() - 1;
                   sc.nextLine(); // to fix the skip error. 
                   String newTaskOfUpdate;
                   System.out.print("Enter the new task: ");
                   newTaskOfUpdate = sc.nextLine();

                   tasks.set(indexOfUpdate, newTaskOfUpdate);
                   System.out.println("TASK UPDATE SUCCESSFULLY!");

                   break;
               case "quit":
                   System.out.println("Thanks for using our task app.....");
                   break;
               default:
                   System.out.println("INVALID INPUT! TRY AGAIN....");
           }

        }while(!userInput.equals("quit"));

    }
}