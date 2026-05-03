package com.narxoz.rpg.guild;

public class Healer extends GuildMember {

    public Healer(String name, GuildMediator mediator) {
        super(name, mediator);
    }

    public void receive(String topic, GuildMember from, String payload) {
        System.out.println("Healer received [" + topic + "] from " + from.getName() + ": " + payload);
    }
}