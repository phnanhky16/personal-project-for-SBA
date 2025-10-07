package com.phnanhky.matrix.entity;


import com.phnanhky.matrix.enums.TeacherRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "teacherMatrix")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherMatrix {
    @Id
    private Integer teacherId;

    @Id
    private Integer matrixId;

    @Enumerated(EnumType.STRING)
    private TeacherRole role;

    private LocalDateTime assignedDate;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "teacherId", insertable = false, updatable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "matrixId", insertable = false, updatable = false)
    private Matrix matrix;
}