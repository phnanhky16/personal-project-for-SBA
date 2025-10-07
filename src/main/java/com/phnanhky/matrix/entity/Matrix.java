package com.phnanhky.matrix.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "matrix")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Matrix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matrixId;

    @ManyToOne
    @JoinColumn(name = "examId")
    private Exam exam;

    private String matrixName;
    private String description;
    private Integer totalQuestions;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "matrix")
    private List<MatrixQuestion> matrixQuestions;
}

