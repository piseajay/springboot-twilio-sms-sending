package com.example.speingboottwilio.configuration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class TwilioInitializer {
	
	@Autowired
	private TwilioConfiguration configuration;
	
	@PostConstruct
	public void init() {
		
		Twilio.init(configuration.getAccountSid(), configuration.getAuthToken());
		log.info("Twilio initialized ... with account sid {} ", configuration.getAccountSid());
	}
}
