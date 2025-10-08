package com.phnanhky.matrix.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "question")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @ManyToOne
    @JoinColumn(name = "lessonId")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "questionTypeId")
    private QuestionType questionType;

    @ManyToOne
    @JoinColumn(name = "levelId")
    private Level level;

    @Column(columnDefinition = "TEXT")
    private String questionText;

    @Column(columnDefinition = "TEXT")
    private String correctAnswer;

    private BigDecimal marks;

    @Column(columnDefinition = "TEXT")
    private String explanation;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "question")
    private List<Options> options;
}
