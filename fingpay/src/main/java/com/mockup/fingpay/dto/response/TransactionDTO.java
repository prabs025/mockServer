package com.mockup.fingpay.dto.response;

import lombok.Data;

@Data
public class TransactionDTO {
    private MetaDTO meta;
    private DataDTO data;

    @Data
    public static class MetaDTO {
        private String status;
        private String code;
        private String description;
    }

    @Data
    public static class DataDTO {
        private String tranType;
        private String terminalId;
        private String aadhaarId;
        private String customerName;
        private String amount;
        private String availableBalance;
        private String stan;
        private String rrn;
        private String uidaiAuthCode;
    }
}
