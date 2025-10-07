package com.phnanhky.matrix.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "appSetting")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AppSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer settingId;

    private String settingName;

    @Column(columnDefinition = "TEXT")
    private String settingValue;

    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}