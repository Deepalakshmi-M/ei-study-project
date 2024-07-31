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