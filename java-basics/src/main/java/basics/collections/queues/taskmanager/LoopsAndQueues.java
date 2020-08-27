package basics.collections.queues.taskmanager;

import java.util.ArrayDeque;

public class LoopsAndQueues {
    public static void main(String[] args) {
        ArrayDeque<String> taskQueue1 = new ArrayDeque<>();
        for(int n=0;n<5;n++) {
            taskQueue1.offer("The first task number: " + (n+1));
        }
        ArrayDeque<String> taskQueue2 = new ArrayDeque<>();
        for (int n=0;n<5;n++) {
            taskQueue2.offer("The second task number: " + (n+1));
        }
        TaskManager executor = new TaskManager();
        executor.executeTasks(taskQueue1);
        executor.executeTasks(taskQueue2);
    }
}
