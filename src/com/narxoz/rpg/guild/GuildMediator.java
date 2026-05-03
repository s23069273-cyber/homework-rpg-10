package com.narxoz.rpg.guild;

public interface GuildMediator {
    void register(GuildMember m);
    void dispatch(String topic, GuildMember from, String payload);
}