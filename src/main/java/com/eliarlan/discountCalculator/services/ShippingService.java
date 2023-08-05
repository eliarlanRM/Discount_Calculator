package com.eliarlan.discountCalculator.services;

import org.springframework.stereotype.Service;

import com.eliarlan.discountCalculator.entities.Order;

@Service
public class ShippingService {
    
    public Double shipment(Order order){
        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() > 200) {
            return 0.0;
        } else {
            return 12.0;
        }
    }
}
