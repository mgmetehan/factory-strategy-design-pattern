package com.mgmetehan.factory.strategy_design_pattern.factory.impl;

import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;
import com.mgmetehan.factory.strategy_design_pattern.factory.NotifiactionFactory;
import com.mgmetehan.factory.strategy_design_pattern.strategy.NotifiactionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class NotifiactionFactoryImpl implements NotifiactionFactory {

    private final Map<String, NotifiactionStrategy> notificationStrategyMap;

    public NotifiactionStrategy getNotificationStrategy(String notificationType) {
        var notificationStrategy = notificationStrategyMap.get(notificationType);
        if (notificationStrategy == null) {
            throw new IllegalArgumentException("Notification type not found: " + notificationType);
        }
        return notificationStrategy;
    }


    @Override
    public String sendNotification(NotificationDto notificationDto) {
        var notificationStrategy = getNotificationStrategy(notificationDto.getNotificationType());
        return notificationStrategy.sendNotification(notificationDto);
    }
}
