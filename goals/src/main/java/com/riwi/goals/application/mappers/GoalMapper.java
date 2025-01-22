package com.riwi.goals.application.mappers;

import com.riwi.goals.application.dtos.request.GoalRequest;
import com.riwi.goals.application.dtos.response.GoalResponse;
import com.riwi.goals.domain.entities.Goal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoalMapper {

    GoalMapper INSTANCE= Mappers.getMapper(GoalMapper.class);

    Goal toEntity(GoalRequest request);
    GoalResponse toResponse(GoalResponse response);
}
