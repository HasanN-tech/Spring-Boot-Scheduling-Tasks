package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExpiredTokenCleanupTask {

	@Scheduled(fixedDelay = 15000,
		    initialDelay = 10000)
	public void cleanupExpiredTokens() throws InterruptedException {
		String[] str= {"Expired JWT tokens","Inactive API tokens","Old authentication records"};
		IO.println("\nCleanup Process Started...\n");
		for(int i=0;i<str.length;i++) {
			IO.println("Deleting "+str[i]+"...");
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		IO.println("\nExpired Records Removed Successfully");
		Thread.sleep(2000);
		IO.println("Cleanup Process Completed...");
	}
}
