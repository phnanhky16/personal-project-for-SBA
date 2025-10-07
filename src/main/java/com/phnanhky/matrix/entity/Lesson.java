package com.phnanhky.matrix.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "lesson")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lessonId;

    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;

    private String lessonTitle;

    @Column(columnDefinition = "TEXT")
    private String lessonContent;

    private Integer lessonOrder;

    @Column(columnDefinition = "TEXT")
    private String learningObjectives;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "lesson")
    private List<Question> questions;
}

