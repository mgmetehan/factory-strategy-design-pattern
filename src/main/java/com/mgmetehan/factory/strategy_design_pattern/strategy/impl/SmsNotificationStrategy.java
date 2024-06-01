package com.mgmetehan.factory.strategy_design_pattern.strategy.impl;

import com.mgmetehan.factory.strategy_design_pattern.constants.NotificationServiceNames;
import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;
import com.mgmetehan.factory.strategy_design_pattern.service.UserService;
import com.mgmetehan.factory.strategy_design_pattern.strategy.NotifiactionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service(NotificationServiceNames.SMS)
@RequiredArgsConstructor
public class SmsNotificationStrategy implements NotifiactionStrategy {

    private final UserService userService;

    @Override
    public String sendNotification(NotificationDto notificationDto) {
        userService.createUser(notificationDto.toUser(notificationDto));
        return "Sms notification sent to " + notificationDto.getTo();
    }
}

