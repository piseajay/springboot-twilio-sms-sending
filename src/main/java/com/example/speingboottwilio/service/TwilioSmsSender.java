package com.example.speingboottwilio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.speingboottwilio.configuration.TwilioConfiguration;
import com.example.speingboottwilio.util.SmsSender;
import com.example.speingboottwilio.vo.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TwilioSmsSender implements SmsSender {

	@Autowired
	private TwilioConfiguration twilioConfiguration;
	
	@Override
	public void sendSms(SmsRequest smsRequest) {
		
		if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
			
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            log.info("Send sms {}", smsRequest);
            
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number"
            );
        }

	}

	 private boolean isPhoneNumberValid(String phoneNumber) {
	        // TODO: Implement phone number validator
	        return true;
	    }
}
