package com.narxoz.rpg.guild;

public abstract class GuildMember {

    private final String name;
    private final GuildMediator mediator;

    public GuildMember(String name, GuildMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    protected GuildMediator getMediator() {
        return mediator;
    }

    public void send(String topic, String payload) {
        mediator.dispatch(topic, this, payload);
    }

    public abstract void receive(String topic, GuildMember from, String payload);
}