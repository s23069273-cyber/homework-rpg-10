package com.narxoz.rpg;

import com.narxoz.rpg.quest.*;
import com.narxoz.rpg.guild.*;

public class Main {

    public static void main(String[] args) {

        QuestLog log = new QuestLog();

        log.addQuest(new Quest("Dragon", QuestPriority.HIGH, 500, true));
        log.addQuest(new Quest("Herbs", QuestPriority.LOW, 50, false));
        log.addQuest(new Quest("Escort", QuestPriority.NORMAL, 200, false));
        log.addQuest(new Quest("Dungeon", QuestPriority.URGENT, 800, true));

        System.out.println("=== ORDERED ===");
        QuestIterator it = log.ordered();
        while (it.hasNext()) {
            System.out.println(it.next().getTitle());
        }

        System.out.println("\n=== REVERSE ===");
        it = log.reverse();
        while (it.hasNext()) {
            System.out.println(it.next().getTitle());
        }

        System.out.println("\n=== PRIORITY >= MEDIUM ===");
        it = log.priorityAtLeast(QuestPriority.NORMAL);
        while (it.hasNext()) {
            System.out.println(it.next().getTitle());
        }

        System.out.println("\n=== MEDIATOR ===");

        GuildHall hall = new GuildHall();

        Captain captain = new Captain("Captain", hall);
        Scout scout = new Scout("Scout", hall);
        Healer healer = new Healer("Healer", hall);
        Quartermaster qm = new Quartermaster("Quartermaster", hall);

        hall.registerTopic("orders", scout);
        hall.registerTopic("orders", healer);
        hall.registerTopic("intel", captain);
        hall.registerTopic("intel", qm);

        captain.giveOrder("Prepare for battle");
        scout.report("Enemies spotted");
    }
}