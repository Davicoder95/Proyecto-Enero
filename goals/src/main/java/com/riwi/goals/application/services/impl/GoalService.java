package com.riwi.goals.application.services.impl;

import com.riwi.goals.application.dtos.exception.ResourceNotFoundException;
import com.riwi.goals.application.dtos.request.GoalRequest;
import com.riwi.goals.application.mappers.GoalMapper;
import com.riwi.goals.domain.entities.Goal;
import com.riwi.goals.domain.enums.Status;
import com.riwi.goals.domain.ports.service.IGoalService;
import com.riwi.goals.infraestructure.persistence.GoalRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GoalService implements IGoalService {

    @Autowired
    private GoalRepository repository;

    @Autowired
    private GoalMapper goalMapper;

    @Override
    public Goal create(GoalRequest request) {
        Goal goal = goalMapper.toEntity(request);
        return repository.save(goal);
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Goal Not Found");
        }
        repository.deleteById(id);
    }

    @Override
    public List<Goal> readAll() {
        return repository.findAll();
    }

    @Override
    public List<Goal> readByStatus(Status status) {
       List<Goal> goals = repository.findByStatus(status);
       if (goals.isEmpty()){
           throw new ResourceNotFoundException("Status Not Found");
       }
       return goals;
    }

    @Override
    public List<Goal> readByTitle(String title) {
        List<Goal> goals = repository.findByTitle(title);
        if (goals.isEmpty()){
            throw new ResourceNotFoundException("Goal Not Found");
        }
        return goals;
    }

    @Override
    public Goal update(Long id, GoalRequest request) {
        Goal goalUpdate= repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Goal Id Not Found"));
        goalMapper.updateEntityFromRequest(request, goalUpdate);

        return repository.save(goalUpdate);
    }
}
