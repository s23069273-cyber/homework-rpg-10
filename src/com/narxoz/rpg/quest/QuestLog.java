package com.narxoz.rpg.quest;

import java.util.ArrayList;
import java.util.List;

public class QuestLog {

    private final List<Quest> quests = new ArrayList<>();

    public void addQuest(Quest q) {
        quests.add(q);
    }

    List<Quest> snapshot() {
        return new ArrayList<>(quests);
    }

    public QuestIterator ordered() {
        return new OrderedQuestIterator(snapshot());
    }

    public QuestIterator reverse() {
        return new ReverseQuestIterator(snapshot());
    }

    public QuestIterator priorityAtLeast(QuestPriority p) {
        return new PriorityQuestIterator(snapshot(), p);
    }
}