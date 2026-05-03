package com.narxoz.rpg.guild;

public class Scout extends GuildMember {

    public Scout(String name, GuildMediator mediator) {
        super(name, mediator);
    }

    public void report(String msg) {
        send("intel", msg);
    }

    public void receive(String topic, GuildMember from, String payload) {
        System.out.println("Scout received [" + topic + "] from " + from.getName() + ": " + payload);
    }
}