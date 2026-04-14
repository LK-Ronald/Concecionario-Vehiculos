package com.concesionario.domain.event;

import java.time.LocalDateTime;
import java.util.Map;

public abstract class DomainEvent {

    private final String eventName;
    private final LocalDateTime occurredOn;

    protected DomainEvent(final String eventName) {
        this.eventName = eventName;
        this.occurredOn = LocalDateTime.now();
    }

    public abstract Map<String, String> payload();

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getOccurredOn() {
        return occurredOn;
    }
}
