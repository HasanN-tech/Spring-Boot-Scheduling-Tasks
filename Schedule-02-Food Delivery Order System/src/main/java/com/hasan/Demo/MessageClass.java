package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageClass {

	@Scheduled(fixedRate = 3000,
			initialDelay = 10000)
	public void displayMsg() {
		IO.println("Display analytics monitoring messages:\r\n"
				+ "Generating Analytics Report...\r\n"
				+ "\r\n"
				+ "Daily Visitors : 1200\r\n"
				+ "Active Users : 850\r\n"
				+ "Sales Count : 245");
	}
}
