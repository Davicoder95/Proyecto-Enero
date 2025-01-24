package com.riwi.goals.controller;

import com.riwi.goals.application.dtos.request.GoalRequest;
import com.riwi.goals.application.dtos.response.GoalResponse;
import com.riwi.goals.application.mappers.GoalMapper;
import com.riwi.goals.domain.entities.Goal;
import com.riwi.goals.domain.enums.Status;
import com.riwi.goals.domain.ports.service.IGoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/goals")
@RequiredArgsConstructor
public class GoalController {

    @Autowired
    private IGoalService goalService;

    @Autowired
    private GoalMapper goalMapper;

    @PostMapping
    public ResponseEntity<GoalResponse> createGoal(@RequestBody GoalRequest request) {
        Goal createdGoal = goalService.create(request);
        GoalResponse response = goalMapper.toResponse(createdGoal);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGoal(@PathVariable Long id) {
        goalService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<GoalResponse>> getAllGoals() {
        List<Goal> goals = goalService.readAll();
        List<GoalResponse> responses = goals.stream()
                .map(goalMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<GoalResponse>> getGoalsByStatus(@PathVariable Status status) {
        List<Goal> goals = goalService.readByStatus(status);
        List<GoalResponse> responses = goals.stream()
                .map(goalMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<GoalResponse>> getGoalsByTitle(@PathVariable String title) {
        List<Goal> goals = goalService.readByTitle(title);
        List<GoalResponse> responses = goals.stream()
                .map(goalMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GoalResponse> updateGoal(@PathVariable Long id, @RequestBody GoalRequest request) {
        Goal updatedGoal = goalService.update(id, request);
        GoalResponse response = goalMapper.toResponse(updatedGoal);
        return ResponseEntity.ok(response);
    }
}
