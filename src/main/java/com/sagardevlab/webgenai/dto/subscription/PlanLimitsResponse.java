package com.sagardevlab.webgenai.dto.subscription;

public record PlanLimitsResponse(
    String planName,
    Integer maxTokensPerDay,
    Integer maxProjects,
    boolean unlimitedAi
) {
}
