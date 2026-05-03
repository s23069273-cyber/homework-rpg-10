package com.narxoz.rpg.quest;

import java.util.List;

public class ReverseQuestIterator implements QuestIterator {

    private final List<Quest> list;
    private int index;

    public ReverseQuestIterator(List<Quest> list) {
        this.list = list;
        this.index = list.size() - 1;
    }

    public boolean hasNext() {
        return index >= 0;
    }

    public Quest next() {
        return list.get(index--);
    }
}