package com.phnanhky.matrix.repository;

import com.phnanhky.matrix.entity.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppSettingRepository extends JpaRepository<AppSetting,Long> {
}
