package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LargeFileProcessor {

	@Scheduled(fixedDelay = 15000,
		    initialDelay = 10000)
	public void processLargeFiles() throws InterruptedException {
		String[] str= {"report.csv","employees.xlsx","documents.pdf"};
		IO.println("\nLarge File Processing Started...\n");
		for(int i=0;i<str.length;i++) {
			IO.println("Processing "+str[i]);
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		IO.println("\nAll Files Processed Successfully");
		Thread.sleep(2000);
		IO.println("Large File Processing Completed...");
	}
}
