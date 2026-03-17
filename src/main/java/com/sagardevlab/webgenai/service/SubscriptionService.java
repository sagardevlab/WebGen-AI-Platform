package com.sagardevlab.webgenai.service;

import com.sagardevlab.webgenai.dto.subscription.SubscriptionResponse;
import com.sagardevlab.webgenai.dto.subscription.CheckoutResponse;
import com.sagardevlab.webgenai.dto.subscription.PortalResponse;
import com.sagardevlab.webgenai.dto.subscription.CheckoutRequest;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
    
    PortalResponse openCustomerPortal(Long userId);
}