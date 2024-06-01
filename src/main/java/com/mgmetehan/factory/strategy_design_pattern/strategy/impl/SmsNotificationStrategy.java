package com.mgmetehan.factory.strategy_design_pattern.strategy.impl;

import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;
import com.mgmetehan.factory.strategy_design_pattern.repository.UserRepository;
import com.mgmetehan.factory.strategy_design_pattern.strategy.NotifiactionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("sms")
@RequiredArgsConstructor
public class SmsNotificationStrategy implements NotifiactionStrategy {

    private final UserRepository userRepository;

    @Override
    public String sendNotification(NotificationDto notificationDto) {
        userRepository.save(notificationDto.toUser(notificationDto));
        return "Sms notification sent to " + notificationDto.getTo();
    }
}

