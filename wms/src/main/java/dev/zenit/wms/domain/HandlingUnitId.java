package dev.zenit.wms.domain;

import java.util.UUID;

public record HandlingUnitId(UUID value) {
    public static HandlingUnitId newId() {
        return new HandlingUnitId(UUID.randomUUID());
    }

    public static HandlingUnitId of(String uuid) {
        return new HandlingUnitId(UUID.fromString(uuid));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}