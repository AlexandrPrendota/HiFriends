package com.hifriends.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author by aleksandrprendota on 24.08.17.
 */
@Data
@NoArgsConstructor
public class MessageDto {
    private String text;
    private String senderName;
    private String senderImagePath;
    private long senderId;
    private Date timeStamp;
}