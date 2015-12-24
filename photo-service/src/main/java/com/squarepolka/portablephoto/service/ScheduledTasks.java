package com.squarepolka.portablephoto.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks
{
	@Scheduled(fixedRate = 1000)
	public void reportCurrentTime()
	{
		System.out.println("Ping Pong");
	}
}
