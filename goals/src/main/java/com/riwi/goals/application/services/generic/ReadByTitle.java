package com.riwi.goals.application.services.generic;

import java.util.List;

public interface ReadByTitle <Entity,Title>{
    public List<Entity> readByTitle(Title title);
}
