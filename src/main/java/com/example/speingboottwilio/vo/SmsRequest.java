package com.example.speingboottwilio.vo;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SmsRequest {

	@NotBlank
    private final String phoneNumber; // destination

    @NotBlank
    private final String message;
}
