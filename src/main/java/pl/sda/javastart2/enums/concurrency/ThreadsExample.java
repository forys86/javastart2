package pl.sda.javastart2.enums.concurrency;

import com.google.common.collect.Lists;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  ThreadsExample {
    public static void main(String[] args) {
        //runnableBasics();
        //bank();
        bankWithExecutors();
    }

    private static void bankWithExecutors() {
       ExecutorService executorService = Executors.newFixedThreadPool(4);
       List<BankClientAction> actions = Lists.newArrayList();
       for (int i = 0; i<1000; i++){
           actions.add(new BankClientAction());
       }
       Instant start = Instant.now();
       for (BankClientAction action:actions){
           executorService.submit(action);
       }
        System.out.println("Ilosc operacji:");
    }

    private static void bank() {
        List<BankClientAction>actions= Lists.newArrayList();
        for (int i = 0; i<1000; i++){
            actions.add(new BankClientAction());
        }
        Instant start = Instant.now();
        for (BankClientAction action:actions){
            action.run();
        }
        System.out.println(Duration.between(start, Instant.now()).getNano());
    }

    private static void runnableBasics() {

        new Runnable() {//zagniezdzona klasa anonimowa
            @Override
            public void run() {
                System.out.println("Anonimowa klasa zagniezdzona");
            }
        };
        Runnable lambdaRunnable = ()->System.out.println("lambda");
        Thread thread2 = new Thread (lambdaRunnable);

    }
}
