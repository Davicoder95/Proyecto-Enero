package com.riwi.goals.application.services.impl;

import com.riwi.goals.application.dtos.request.GoalRequest;
import com.riwi.goals.domain.entities.Goal;
import com.riwi.goals.domain.enums.Status;
import com.riwi.goals.domain.ports.service.IGoalService;
import com.riwi.goals.infraestructure.persistence.GoalRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GoalService implements IGoalService {

    @Autowired
    private GoalRepository repository;


    @Override
    public Goal create(GoalRequest request) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<Goal> readAll() {
        return List.of();
    }

    @Override
    public Optional<Goal> readByStatus(Status status) {
        return Optional.empty();
    }

    @Override
    public Optional<Goal> readByTitle(String s) {
        return Optional.empty();
    }

    @Override
    public Goal update(Long aLong, GoalRequest entity) {
        return null;
    }
}
