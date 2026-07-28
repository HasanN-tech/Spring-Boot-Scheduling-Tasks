package com.hasan.Demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EveryMinute {
	@Scheduled(cron="0 * * * * *")
	public void minuteExecution() {
		IO.println("Hello Spring");
	}
	int a=100;
//	@Scheduled(cron="0 0 17,18,19,20 * * *")
//	@Scheduled(cron="0 0 9-17 * * *")
//	@Scheduled(cron="*/5 * * * * *")
//	@Scheduled(cron="0 */5 * * * *")
//	@Scheduled(cron="0 0 10 ? * THU")
//	@Scheduled(cron="0 0 10 L * *")
//	@Scheduled(cron="0 0 9 15 * *")
//	@Scheduled(cron="0 0 9 ? * MON#2")
	@Scheduled(cron="*/1 * * * * *")
	public void hourExecution() {
		IO.println(a);
		a=a-1;
	}
//	@Scheduled(cron="*/30 * * * * *")
//	@Scheduled(cron="0 */10 * * * *")
//	@Scheduled(cron="0 0 */2 * * *")
//	@Scheduled(cron="0 0 8 * * *")
//	@Scheduled(cron="0 0 7 * * MON")
//	@Scheduled(cron="0 30 11 * * SUN")
//	@Scheduled(cron="0 0 12 5 * *")
//	@Scheduled(cron="0 0 0 1 1 *")
//	@Scheduled(cron="0 0 20 * * SAT")
//	@Scheduled(cron="0 45 19 * * FRI")
//	@Scheduled(cron="0 0 18 * * *")
	@Scheduled(cron="0 0 0 * * *")
	public void stock() {
		IO.println("Spring...");
	}
}
