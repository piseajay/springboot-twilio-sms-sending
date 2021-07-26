package com.example.speingboottwilio.util;

import com.example.speingboottwilio.vo.SmsRequest;

public interface SmsSender {

	void sendSms(SmsRequest smsRequest);
}
