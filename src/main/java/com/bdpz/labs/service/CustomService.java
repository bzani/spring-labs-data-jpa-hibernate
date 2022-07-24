package com.bdpz.labs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("customService")
public class CustomService {

	@Autowired
	private NotificationService notificationService;
	
	public void notify(String msg, Object obj) {
		notificationService.send(msg, obj);
	}

}