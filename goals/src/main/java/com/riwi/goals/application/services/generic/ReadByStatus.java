package com.riwi.goals.application.services.generic;

import java.util.Optional;

public interface ReadByStatus <Entity, Status> {
    public Optional<Entity> readByStatus(Status status);
}
