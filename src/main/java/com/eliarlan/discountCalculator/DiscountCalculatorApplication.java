package com.eliarlan.discountCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eliarlan.discountCalculator.entities.Order;
import com.eliarlan.discountCalculator.services.OrderService;

@SpringBootApplication
public class DiscountCalculatorApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DiscountCalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order exemplo1 = new Order(1034, 150.00, 20.00);
		System.out.println("Pedido código: " + exemplo1.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(exemplo1) + "\n");

		Order exemplo2 = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código: " + exemplo1.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(exemplo2) + "\n");

		Order exemplo3 = new Order(1309, 95.90, 0.00);
		System.out.println("Pedido código: " + exemplo1.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(exemplo3));
	}
}
