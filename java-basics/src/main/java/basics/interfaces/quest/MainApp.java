package basics.interfaces.quest;

public class MainApp {
    public static void main(String[] args) {
        Knight knight = new Knight(new DeadIslandQuest());
        Quest quest = new DeadIslandQuest();
        System.out.println(knight.quest.process());
        quest.questCompleted();
    }
}
