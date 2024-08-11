package com.mockup.fingpay.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/*
    @created 11/08/2024 11:18 PM
    @project 2.0
    @author biplaw.chaudhary
*/
@Getter
@Setter
public class FingpayAuthData {
        private String fingpayTransactionId;
        private String tefPkId;
        private String bankRrn;
        private String fpRrn;
        private String stan;
        private String merchantTranId;
        private String responseCode;
        private String responseMessage;
        private String mobileNumber;
        private String transactionTimestamp;

        public FingpayAuthData(){
            this.fingpayTransactionId="AUOAM6316395110824130856481A";
            this.tefPkId = "135519";
            this.stan = "535519";
            this.merchantTranId="422413694537";
            this.responseCode ="00";
            this.responseMessage = "Success";
            this.mobileNumber=String.valueOf(908000001);
            transactionTimestamp= LocalDateTime.now().toString();
        }
}
