#schedule class

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Task> tasks;

    public Schedule() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the schedule.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task " + (i + 1) + ": " + tasks.get(i));
            }
        }
    }
}
import java.util.Scanner;

public class AstronautScheduleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schedule schedule = new Schedule();

        while (true) {
            System.out.println("Astronaut Schedule Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time: ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time: ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority level (1-5): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Task newTask = new Task(description, startTime, endTime, priority);
                    schedule.addTask(newTask);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    schedule.removeTask(index - 1);
                    System.out.println("Task removed.");
                    break;

                case 3:
                    schedule.viewTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
