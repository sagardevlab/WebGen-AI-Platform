package com.sagardevlab.webgenai.service;

import com.sagardevlab.webgenai.dto.usage.UsageTodayResponse;
import com.sagardevlab.webgenai.dto.usage.PlanLimitsResponse;

public interface UsageService {
    
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
