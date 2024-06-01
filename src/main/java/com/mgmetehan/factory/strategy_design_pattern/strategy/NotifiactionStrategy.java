package com.mgmetehan.factory.strategy_design_pattern.strategy;

import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;

public interface NotifiactionStrategy {
    String sendNotification(NotificationDto notificationDto);
}
