package com.phnanhky.matrix.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "matrixQuestion")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatrixQuestion {
    @Id
    private Long matrixId;

    @Id
    private Long questionId;

    private Long questionOrder;
    private Float marksAllocated;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "matrixId", insertable = false, updatable = false)
    private Matrix matrix;

    @ManyToOne
    @JoinColumn(name = "questionId", insertable = false, updatable = false)
    private Question question;
}

