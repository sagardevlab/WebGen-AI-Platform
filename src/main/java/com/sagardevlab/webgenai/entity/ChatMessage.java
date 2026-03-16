package com.sagardevlab.webgenai.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.Instant;
import com.sagardevlab.webgenai.enums.MessageRole;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;

    Integer tokenUsed;

    Instant createdAt;
}
