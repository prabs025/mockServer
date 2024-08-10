package com.mockup.fingpay.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    @created 10/08/2024 12:51 PM
    @project mockServer
    @author biplaw.chaudhary
*/
@Getter
@Setter
@ToString
public class CredopayTransactionCompleteRequestDto {
    private String transaction_id;
}

