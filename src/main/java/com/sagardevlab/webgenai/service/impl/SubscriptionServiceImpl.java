package com.sagardevlab.webgenai.service.impl;

import org.springframework.stereotype.Service;

import com.sagardevlab.webgenai.dto.subscription.CheckoutRequest;
import com.sagardevlab.webgenai.dto.subscription.CheckoutResponse;
import com.sagardevlab.webgenai.dto.subscription.SubscriptionResponse;
import com.sagardevlab.webgenai.service.SubscriptionService;
import com.sagardevlab.webgenai.dto.subscription.PortalResponse;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
    
}
