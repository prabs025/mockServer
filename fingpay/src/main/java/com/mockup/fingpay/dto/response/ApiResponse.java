package com.mockup.fingpay.dto.response;

import com.mockup.fingpay.utils.DateTimeUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
    @created 12/07/2024 8:11 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
    private String terminalId;
    private String requestTransactionTime;
    private Long transactionAmount;
    private String transactionStatus;
    private Long balanceAmount;
    private String bankRRN;
    private String transactionType;
    private String FingpayTransactionId;
    private String merchantIxnId;
    private String responseCode;

    public  ApiResponse(String transactionType) {

        String currentTime = DateTimeUtil.getFormattedCurrentDateTime();
        this.setRequestTransactionTime(currentTime);

        switch (transactionType) {
            case "CW":
                this.setTerminalId("FA274530");

                this.setTransactionAmount(590L);
                this.setTransactionStatus("failed");
                this.setBalanceAmount(0L);
                this.setBankRRN("012200836920");
                this.setTransactionType("CW");
                this.setFingpayTransactionId("CWBD0491833010520000431984I");
                this.setMerchantIxnId("1588271670690");
//                this.setResponseCode("U3");
                this.setResponseCode("0012");
                break;

            case "BI":
                this.setTerminalId("FA012123");

                this.setTransactionAmount(101L);
                this.setTransactionStatus("SUCCESS");
                this.setBalanceAmount(200L);
                this.setBankRRN("765765656857");
                this.setTransactionType("BE");
                this.setFingpayTransactionId("BE00010291117175529");
                this.setMerchantIxnId("123221");
                this.setResponseCode("00");
                break;

            case "MS":
                this.setTerminalId("FA012123");

                this.setTransactionAmount(101L);
                this.setTransactionStatus("SUCCESS");
                this.setBalanceAmount(200L);
                this.setBankRRN("765765656857");
                this.setTransactionType("M");
                this.setFingpayTransactionId("MB00010291117175529");
                this.setMerchantIxnId("123221");
                this.setResponseCode("00");
                break;

            case "AP":
                this.setTerminalId("FA012123");
                this.setTransactionAmount(101L);
                this.setTransactionStatus("SUCCESS");
                this.setBalanceAmount(200L);
                this.setBankRRN("765765656857");
                this.setTransactionType("M");
                this.setFingpayTransactionId("MB00010291117175529");
                this.setMerchantIxnId("123221");
                this.setResponseCode("00");
                break;

            default:
                throw new IllegalArgumentException("Invalid transaction type: " + transactionType);
        }
        
    }
}
