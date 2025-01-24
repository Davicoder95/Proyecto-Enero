package com.riwi.goals.domain.ports.service;

import com.riwi.goals.application.dtos.request.GoalRequest;

import com.riwi.goals.application.services.generic.*;
import com.riwi.goals.domain.entities.Goal;
import com.riwi.goals.domain.enums.Status;

import java.util.List;

public interface IGoalService extends
        Create<Goal, GoalRequest>,
        Delete<Long>,
        ReadAll<Goal>,
        Update<Long,Goal,GoalRequest>,
        ReadByStatus<Goal, Status>,
        ReadByTitle<Goal,String>{
}
