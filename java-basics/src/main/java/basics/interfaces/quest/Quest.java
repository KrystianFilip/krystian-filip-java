package basics.interfaces.quest;

public interface Quest {
    String process();

    default void questCompleted() {
        System.out.println("Quest has been completed.");
    }
}
