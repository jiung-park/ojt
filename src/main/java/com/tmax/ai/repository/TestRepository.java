package com.tmax.ai.repository;

import com.tmax.ai.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {

    List<Test> findAllByUsername(String username);

}
