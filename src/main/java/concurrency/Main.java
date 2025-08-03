package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("task-1");
        PrintTask task2 = new PrintTask("task-2");
        PrintTask task3 = new PrintTask("task-3");

        System.out.println("Starting Executor");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();

        System.out.println("Tasks started, Main ends ...");
    }
}
