package com.bdpz.labs.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NotificationService {

	public void send(String msg, Object obj) {
		log.info(msg, obj.toString());
		//push into queue
	}

}