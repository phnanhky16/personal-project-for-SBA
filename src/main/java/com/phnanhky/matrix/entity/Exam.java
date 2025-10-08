package com.phnanhky.matrix.entity;

import com.phnanhky.matrix.enums.ExamStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exam")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;

    private String examName;
    private String description;
    private Integer durationMinutes;
    private Float totalMarks;
    private Float passingMarks;
    private LocalDateTime examDate;

    @Enumerated(EnumType.STRING)
    private ExamStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "exam")
    private List<Matrix> matrices;
}


