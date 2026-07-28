package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FraudDetectionTask {

	@Scheduled(fixedDelay = 15000)
	public void detectFraudTransactions() throws InterruptedException {
		Transaction transactions[] = {
			    new Transaction("TX101",25000,"SUCCESS"),
			    new Transaction("TX102",85000,"PENDING"),
			    new Transaction("TX103",15000,"SUCCESS"),
			    new Transaction("TX104",92000,"PENDING"),
			    new Transaction("TX105",45000,"PENDING")

			};
		
		
		IO.println("\nCleanup Process Started...\n");
		int cnt=0;
		for(int i=0;i<transactions.length;i++) {
			IO.println("Checking Transaction "+transactions[i].getId());
			
			Thread.sleep(2000);
			if(transactions[i].getAmount() > 50000 &&
					transactions[i].getStatus().equals("PENDING")) {
				System.err.println("Fraud Alert for: "+transactions[i].getId());
				cnt++;
			}
		}
		Thread.sleep(3000);
		IO.println("\nFraud Detection Completed");
		Thread.sleep(2000);
		IO.println("Total Suspicious Transactions: "+cnt);
	}
}
