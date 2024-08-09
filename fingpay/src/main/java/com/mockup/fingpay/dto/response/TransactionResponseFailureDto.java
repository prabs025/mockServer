package com.mockup.fingpay.dto.response;

import com.mockup.fingpay.utils.DateTimeUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionResponseFailureDto {
    private String terminalId;
    private String requestTransactionTime;
    private Long transactionAmount;
    private String transactionStatus;
    private Long balanceAmount;
    private String bankRRN;
    private String transactionType;
    private String fpTransactionId;
    private String merchantTxnId;
    private String errorCode;
    private String errorMessage;
    private String merchantTransactionId;
    private String responseCode;

    public TransactionResponseFailureDto(String type) {
        String currentTime = DateTimeUtil.getFormattedCurrentDateTime();
        this.requestTransactionTime = currentTime;

        switch (type) {
            case "CW":
                this.terminalId = "FA274530";
                this.transactionAmount = 590L;
                this.transactionStatus = "failed";
                this.balanceAmount = 0L;
                this.bankRRN = "012200836920";
                this.transactionType = "CW";
                this.fpTransactionId = "CWBD0491833010520000431984I";
                this.merchantTxnId = "1588271670690";
                this.responseCode = "U3";
                this.errorCode = "U3";
                this.errorMessage = "Fingerprint did not match with Aadhaar, please try another finger";
                this.merchantTransactionId = null;
                break;

            case "M":
                this.terminalId = "FA274530";
                this.transactionAmount = 590L;
                this.transactionStatus = "failed";
                this.balanceAmount = 0L;
                this.bankRRN = "012200836920";
                this.transactionType = "M";
                this.fpTransactionId = "MBD0491833010520000431984I";
                this.merchantTxnId = "1588271670690";
                this.responseCode = "U3";
                this.errorCode = "U3";
                this.errorMessage = "Fingerprint did not match with Aadhaar, please try another finger";
                this.merchantTransactionId = null;
                break;

            case "BE":
                this.terminalId = "FA274530";
                this.transactionAmount = 590L;
                this.transactionStatus = "failed";
                this.balanceAmount = 0L;
                this.bankRRN = "012200836920";
                this.transactionType = "BE";
                this.fpTransactionId = "BEBD0491833010520000431984I";
                this.merchantTxnId = "1588271670690";
                this.responseCode = "U3";
                this.errorCode = "U3";
                this.errorMessage = "Fingerprint did not match with Aadhaar, please try another finger";
                this.merchantTransactionId = null;
                break;

            default:
                throw new IllegalArgumentException("Invalid transaction type: " + transactionType);
        }
    }
}
