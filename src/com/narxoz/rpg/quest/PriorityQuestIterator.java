package com.narxoz.rpg.quest;

import java.util.List;

public class PriorityQuestIterator implements QuestIterator {

    private final List<Quest> list;
    private final QuestPriority threshold;
    private int index = 0;

    public PriorityQuestIterator(List<Quest> list, QuestPriority threshold) {
        this.list = list;
        this.threshold = threshold;
    }

    public boolean hasNext() {
        while (index < list.size()) {
            if (list.get(index).getPriority().ordinal() >= threshold.ordinal()) {
                return true;
            }
            index++;
        }
        return false;
    }

    public Quest next() {
        return list.get(index++);
    }
}