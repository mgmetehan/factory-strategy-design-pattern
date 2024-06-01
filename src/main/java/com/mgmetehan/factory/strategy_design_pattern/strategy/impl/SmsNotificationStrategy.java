package com.mgmetehan.factory.strategy_design_pattern.strategy.impl;

import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;
import com.mgmetehan.factory.strategy_design_pattern.strategy.NotifiactionStrategy;
import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationStrategy implements NotifiactionStrategy {

    @Override
    public String sendNotification(NotificationDto notificationDto) {
        return "Sms notification sent to " + notificationDto.getTo();
    }
}

