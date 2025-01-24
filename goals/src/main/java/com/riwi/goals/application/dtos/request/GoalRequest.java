package com.riwi.goals.application.dtos.request;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoalRequest {

    @Column( nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;


    @Column(nullable = false)
    private String targetValue;

    @Column(nullable = false)
    private LocalDate endDate;

}