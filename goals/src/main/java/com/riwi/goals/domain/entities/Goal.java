package com.riwi.goals.domain.entities;

import com.riwi.goals.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @CreationTimestamp
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = true)
    private String currentMount;

    @Column(nullable = true)
    private Status status;

    @Column(nullable = false)
    private String targetValue;

    //FK, Se debe modificar a la hora de conectarse
    @Column(nullable = false)
    private Long userId;
}
