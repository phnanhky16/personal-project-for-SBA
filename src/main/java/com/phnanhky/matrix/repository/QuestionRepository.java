package com.phnanhky.matrix.repository;

import com.phnanhky.matrix.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
