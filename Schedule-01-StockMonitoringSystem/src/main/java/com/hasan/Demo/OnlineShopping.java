package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OnlineShopping {
	
	@Scheduled(fixedRate = 3000)
	public void checkOrders() {
		IO.println("Checking Order Status...\r\n"
				+ "\r\n"
				+ "Order ID : 101 → Packed\r\n"
				+ "Order ID : 102 → Shipped\r\n"
				+ "Order ID : 103 → Delivered");
	}
	
	@Scheduled(fixedRate = 5000)
	public void checkPaymentGateway() {
		IO.println("Checking Payment Gateway...\r\n"
				+ "\r\n"
				+ "UPI Service : Active\r\n"
				+ "Credit Card Service : Available\r\n"
				+ "Net Banking : Working");
	}
}
