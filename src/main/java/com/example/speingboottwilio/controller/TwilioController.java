package com.example.speingboottwilio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.speingboottwilio.service.TwilioService;
import com.example.speingboottwilio.vo.SmsRequest;
import com.example.speingboottwilio.vo.SmsResponse;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {
	
	@Autowired
	private TwilioService service;

	@PostMapping
    public ResponseEntity<SmsResponse> sendSms(@Valid @RequestBody SmsRequest smsRequest) {
		
        service.sendSms(smsRequest);
        return new ResponseEntity<>(new SmsResponse(200, "Message sent successfully!!!!"),HttpStatus.OK);
    }
}
