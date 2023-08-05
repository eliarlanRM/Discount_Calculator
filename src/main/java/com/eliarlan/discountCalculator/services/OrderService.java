package com.eliarlan.discountCalculator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliarlan.discountCalculator.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        return order.getBasic() - (order.getBasic() * order.getDiscount()) + shippingService.shipment(order);
    }
}
