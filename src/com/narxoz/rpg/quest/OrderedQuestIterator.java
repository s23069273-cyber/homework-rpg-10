package com.narxoz.rpg.quest;

import java.util.List;

public class OrderedQuestIterator implements QuestIterator {

    private final List<Quest> list;
    private int index = 0;

    public OrderedQuestIterator(List<Quest> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public Quest next() {
        return list.get(index++);
    }
}