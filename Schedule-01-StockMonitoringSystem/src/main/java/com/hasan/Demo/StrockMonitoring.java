package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;

public class StrockMonitoring {
	
	@Scheduled(fixedRate = 3000)
    public void checkInventory() {

        System.out.println("Checking Warehouse Inventory Status...\n");

        System.out.println("Laptop : Available in Stock");
        System.out.println("Mobile : Out Of Stock");
        System.out.println("Headphones : Low Stock — Refill Required");
        System.out.println("\n----------------------------------\n");
    }
}
