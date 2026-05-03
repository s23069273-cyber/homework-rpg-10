package com.narxoz.rpg.guild;

import java.util.*;

public class GuildHall implements GuildMediator {

    private final Map<String, List<GuildMember>> topics = new HashMap<>();

    public void registerTopic(String topic, GuildMember member) {
        topics.computeIfAbsent(topic, k -> new ArrayList<>()).add(member);
    }

    public void register(GuildMember m) {
    }

    public void dispatch(String topic, GuildMember from, String payload) {
        List<GuildMember> subs = topics.get(topic);
        if (subs != null) {
            for (GuildMember m : subs) {
                if (m != from) {
                    m.receive(topic, from, payload);
                }
            }
        }
    }
}