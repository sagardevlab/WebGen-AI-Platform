package com.sagardevlab.webgenai.controller;

import com.sagardevlab.webgenai.service.SubscriptionService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.sagardevlab.webgenai.dto.subscription.PlanResponse;
import com.sagardevlab.webgenai.dto.subscription.SubscriptionResponse;
import com.sagardevlab.webgenai.dto.subscription.CheckoutResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.sagardevlab.webgenai.dto.subscription.CheckoutRequest;
import com.sagardevlab.webgenai.dto.subscription.PortalResponse;
import java.util.List;

import com.sagardevlab.webgenai.service.PlanService;

@RestController
@AllArgsConstructor
public class BillingController {
    
    private final PlanService planService;

    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(@RequestBody CheckoutRequest request){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request, userId));
    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    } 

}
