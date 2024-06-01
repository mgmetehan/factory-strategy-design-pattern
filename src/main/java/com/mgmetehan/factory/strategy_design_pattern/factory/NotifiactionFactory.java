package com.mgmetehan.factory.strategy_design_pattern.factory;

import com.mgmetehan.factory.strategy_design_pattern.dto.NotificationDto;

public interface NotifiactionFactory {

    String sendNotification(NotificationDto notificationDto);
}
