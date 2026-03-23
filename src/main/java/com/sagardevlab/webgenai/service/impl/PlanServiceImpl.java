package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;
import com.sagardevlab.webgenai.service.PlanService;
import java.util.List;
import com.sagardevlab.webgenai.dto.subscription.PlanResponse;


@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }

    
}
