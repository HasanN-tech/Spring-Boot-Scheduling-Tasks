package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderProcessor {

	private boolean orderAvailable = false;

	@Scheduled(fixedRate = 3000, initialDelay = 10000)
	public synchronized void waitAndPrepareFood() {

		try {
			while (!orderAvailable) {
				IO.println("--------------------------------");
				IO.println("Chef : Waiting for customer order...");
				IO.println("--------------------------------");

				wait();
			}
			IO.println("\nChef : Order received");
			IO.println("Chef : Preparing food...");
			Thread.sleep(2000);

			IO.println("Chef : Food prepared successfully");
			IO.println("Chef : Food Delivered to Customer");

			orderAvailable = false;

			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Scheduled(fixedRate = 3000, initialDelay = 10000)
	public synchronized void placeFoodOrder() {

		try {

			System.out.println("\nCustomer : Sending new order to chef\n");

			orderAvailable = true;

			notify();

			wait(3000);

			System.out.println("\nCustomer : Food Received Successfully.... THANK YOU!");

			System.out.println("\n--------------------------------\n");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
