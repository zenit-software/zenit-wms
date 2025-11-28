package dev.zenit.wms.domain;

import java.util.UUID;

public record BinId(UUID value) {
    public static BinId newId() {
        return new BinId(UUID.randomUUID());
    }

    public static BinId of(String uuid) {
        return new BinId(UUID.fromString(uuid));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}