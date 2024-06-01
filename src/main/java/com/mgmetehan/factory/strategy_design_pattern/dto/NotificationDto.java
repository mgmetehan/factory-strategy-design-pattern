package com.mgmetehan.factory.strategy_design_pattern.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private String to;
    private String body;
    private String notificationType;
}
