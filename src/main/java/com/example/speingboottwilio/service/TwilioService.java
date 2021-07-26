package com.example.speingboottwilio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.speingboottwilio.util.SmsSender;
import com.example.speingboottwilio.vo.SmsRequest;

@Service
public class TwilioService {

	@Autowired
	private SmsSender smsSender;

	public void sendSms(SmsRequest smsRequest) {
		smsSender.sendSms(smsRequest);
	}
}
