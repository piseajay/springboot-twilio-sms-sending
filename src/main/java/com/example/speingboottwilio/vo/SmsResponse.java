package com.example.speingboottwilio.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmsResponse {

	private int responseCode;
	private String responseMessage;
}
