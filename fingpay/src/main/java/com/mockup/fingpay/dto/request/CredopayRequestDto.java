package com.mockup.fingpay.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    @created 09/08/2024 11:26 PM
    @project mockServer
    @author biplaw.chaudhary
*/
@Getter
@Setter
@ToString
public class CredopayRequestDto {
    private String encrypted;
}
