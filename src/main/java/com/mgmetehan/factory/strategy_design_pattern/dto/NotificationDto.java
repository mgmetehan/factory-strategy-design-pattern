package com.mgmetehan.factory.strategy_design_pattern.dto;

import com.mgmetehan.factory.strategy_design_pattern.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String to;
    private String body;
    private String notificationType;

    public User toUser(NotificationDto dto) {
        return User.builder()
                .username(dto.getTo())
                .build();
    }
}
