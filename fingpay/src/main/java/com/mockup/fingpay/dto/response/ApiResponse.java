package com.mockup.fingpay.dto.response;

import lombok.Getter;
import lombok.Setter;

/*
    @created 12/07/2024 8:11 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Getter
@Setter
public class ApiResponse {
    private String terminalId;
    private String requestTransactionTime;
    private Long transactionAmount;
    private String transactionStatus;
    private Long balanceAmount;
    private String bankRRN;
    private Character transactionType;
    private String FingpayTransactionId;
    private String merchantIxnId;
    private String responseCode;
}
