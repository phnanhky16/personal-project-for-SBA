package com.phnanhky.matrix.repository;

import com.phnanhky.matrix.entity.MatrixQuestion;
import com.phnanhky.matrix.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionsRepository extends JpaRepository<Options,Long> {
}
