package com.riwi.goals.application.services.generic;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

public interface ReadByStatus <Entity, Status> {
    public List<Entity> readByStatus(Status status);
}
