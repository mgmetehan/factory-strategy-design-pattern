package com.mgmetehan.factory.strategy_design_pattern.repository;

import com.mgmetehan.factory.strategy_design_pattern.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
