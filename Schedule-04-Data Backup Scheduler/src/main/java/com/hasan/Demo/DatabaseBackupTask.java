package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseBackupTask {

	@Scheduled(fixedDelay = 10000)
	public void backUpData() throws InterruptedException {
		String[] str={"Users","Products","Orders","Payments","Customers"};
		IO.println("\nDatabase Backup Started...\n");
		for(int i=0;i<str.length;i++) {
			IO.println("Backing up "+str[i]+" Table...");
		}
		
		Thread.sleep(5000);
		IO.println("\nDatabase Backup Stored Successfully");
		IO.println("Database Backup Completed...");
	}
}
