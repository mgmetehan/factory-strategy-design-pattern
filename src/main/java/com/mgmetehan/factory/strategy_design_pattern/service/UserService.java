package com.mgmetehan.factory.strategy_design_pattern.service;

import com.mgmetehan.factory.strategy_design_pattern.model.User;
import com.mgmetehan.factory.strategy_design_pattern.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }
}
