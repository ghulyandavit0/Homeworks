import java.util.LinkedList;

public class LinkedLists {

    public static void addTask(LinkedList<String> tasks, String task) {
        tasks.addLast(task);
    }
    public static String startNextTask(LinkedList<String> tasks) {
        if(tasks.isEmpty()) {
            return "No tasks";
        }
        return tasks.pollFirst();
    }
    public static String showNextTask(LinkedList<String> tasks) {
        return tasks.peekFirst();
    }
    public static boolean checkTaskContainment(LinkedList<String> tasks, String value) {
        return tasks.contains(value);
    }
    public static int queueSize(LinkedList<String> tasks) {
        return tasks.size();
    }
    public static void printAllTasks(LinkedList<String> tasks) {
        System.out.println("all tasks in queue: " + tasks);
    }
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        addTask(tasks, "Youtube");
        addTask(tasks, "Google");
        addTask(tasks, "Intellij Idea");
        printAllTasks(tasks);

        System.out.println("next task: " + showNextTask(tasks));

        String done = startNextTask(tasks);
        System.out.println("completed: " + done);

        System.out.println("final size of queue: " + queueSize(tasks));
        printAllTasks(tasks);
    }
}
