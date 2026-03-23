package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.dto.usage.PlanLimitsResponse;
import com.sagardevlab.webgenai.dto.usage.UsageTodayResponse;
import com.sagardevlab.webgenai.service.UsageService;

@Service
public class UsageServiceImpl implements UsageService{

    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return new UsageTodayResponse(0, 0, 0, 0);
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return new PlanLimitsResponse("Free Plan", 1000, 3, false);
    }
    
}
