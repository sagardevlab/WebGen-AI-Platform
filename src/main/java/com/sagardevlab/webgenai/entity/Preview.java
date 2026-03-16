package com.sagardevlab.webgenai.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.Instant;

import com.sagardevlab.webgenai.enums.PreviewStatus;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
    
    Long id;

    Project project;

    String namespace;

    String podName;

    String previewUrl;

    PreviewStatus status;

    Instant createdAt;

    Instant startedAt;

    Instant terminatedAt;
}
