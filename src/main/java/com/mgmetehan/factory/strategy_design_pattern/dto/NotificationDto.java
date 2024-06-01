package com.mgmetehan.factory.strategy_design_pattern.dto;

import com.mgmetehan.factory.strategy_design_pattern.model.User;
import com.mgmetehan.factory.strategy_design_pattern.type.NotificationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String to;
    private String body;
    private NotificationType notificationType;

    public User toUser(NotificationDto dto) {
        User user = new User();
        user.setUsername(dto.getTo());
        return user;
    }
}
