package com.sagardevlab.webgenai.service;

import java.util.List;
import com.sagardevlab.webgenai.dto.subscription.PlanResponse;

public interface PlanService {
    public List<PlanResponse> getAllActivePlans();
}
