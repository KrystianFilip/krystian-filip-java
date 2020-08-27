package basics.collections.queues.taskmanager;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> executedTasks;

    public TaskManager() {
        executedTasks = new ArrayList<String>();
    }
    public void executeTasks(ArrayDeque<String> theQueue) {
        while(theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println("Processing the Task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nTotal of executed tasks: " + executedTasks.size());
    }
}
