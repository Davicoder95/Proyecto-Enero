package com.riwi.goals.application.mappers;

import com.riwi.goals.application.dtos.request.GoalRequest;
import com.riwi.goals.application.dtos.response.GoalResponse;
import com.riwi.goals.domain.entities.Goal;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GoalMapper {
    Goal toEntity(GoalRequest request);
    GoalResponse toResponse(Goal response);
    void updateEntityFromRequest(GoalRequest request, @MappingTarget Goal entity);
}
