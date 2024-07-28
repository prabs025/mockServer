package com.mockup.fingpay.dto.request;

import lombok.Getter;
import lombok.Setter;

/*
    @created 12/07/2024 8:04 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Getter
@Setter
public class MainRequestDto {
    private P2CardnumberORUID cardnumberORUID;
    private String mobileNumber;
    private String paymentType;
    private String timestamp;
    private String transactionType;
    private double latitude;
    private double longitude;
    private String requestRemarks;
    private String deviceTransactionId;
    private CaptureResponse captureResponse;
    private String languageCode;
    private double transactionAmount;
    private String merchantTransactionId;
    private String merchantUserName;
    private String merchantPin;
    private String subMerchantId;
    private String superMerchantId;
}
