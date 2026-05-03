package com.narxoz.rpg.guild;

public class Captain extends GuildMember {

    public Captain(String name, GuildMediator mediator) {
        super(name, mediator);
    }

    public void giveOrder(String msg) {
        send("orders", msg);
    }

    public void receive(String topic, GuildMember from, String payload) {
        System.out.println("Captain received [" + topic + "] from " + from.getName() + ": " + payload);
    }
}