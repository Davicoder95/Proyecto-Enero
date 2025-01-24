package com.riwi.goals.infraestructure.persistence;

import com.riwi.goals.domain.entities.Goal;
import com.riwi.goals.domain.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository  extends JpaRepository< Goal, Long> {

    List<Goal> findByTitle(String title);

    List<Goal> findByStatus(Status status);

}
