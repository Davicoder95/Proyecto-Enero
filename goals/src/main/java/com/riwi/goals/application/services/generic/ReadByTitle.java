package com.riwi.goals.application.services.generic;

import java.util.Optional;

public interface ReadByTitle <Entity,Title>{
    public Optional<Entity>readByTitle(Title title);
}
