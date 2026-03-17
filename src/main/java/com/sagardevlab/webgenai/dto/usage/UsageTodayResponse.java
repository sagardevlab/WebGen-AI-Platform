package com.sagardevlab.webgenai.dto.usage;

public record UsageTodayResponse(
    int tokensUsed,
    int tokensLimit,
    int previewsRunning,
    int previewsLimit
) {
    
}
