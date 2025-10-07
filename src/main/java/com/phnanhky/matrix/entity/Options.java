package com.phnanhky.matrix.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "options")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer optionId;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;

    @Column(columnDefinition = "TEXT")
    private String optionText;

    private Boolean isCorrect;
    private Integer optionOrder;
    private LocalDateTime createdAt;
}

