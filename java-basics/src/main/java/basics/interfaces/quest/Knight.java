package basics.interfaces.quest;

public class Knight {
    Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void process() {
        quest.process();
    }
}
