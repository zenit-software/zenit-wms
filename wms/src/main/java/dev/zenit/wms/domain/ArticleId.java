package dev.zenit.wms.domain;

import java.util.UUID;

public record ArticleId(UUID value) {
    public static ArticleId newId() {
        return new ArticleId(UUID.randomUUID());
    }

    public static ArticleId of(String uuid) {
        return new ArticleId(UUID.fromString(uuid));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}