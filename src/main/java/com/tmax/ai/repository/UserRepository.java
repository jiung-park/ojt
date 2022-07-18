package com.tmax.ai.repository;

import com.tmax.ai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username); // Question 네이밍이 정해져있는것으로 보임

}
