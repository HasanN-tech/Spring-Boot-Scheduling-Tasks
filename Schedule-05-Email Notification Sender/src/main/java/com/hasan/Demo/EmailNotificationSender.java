package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationSender {

	@Scheduled(fixedDelay = 10000)
	public void sendQueuedEmails() throws InterruptedException {
		
		IO.println("\nEmail Sending Started...\n");
		for(int i=1;i<=5;i++) {
			IO.println("Sending email: "+i);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		IO.println("\nAll Emails Sent Successfully");
		IO.println("Email Sending Completed...");
	}
}
