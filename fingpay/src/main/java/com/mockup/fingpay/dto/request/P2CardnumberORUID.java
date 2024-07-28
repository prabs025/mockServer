package com.mockup.fingpay.dto.request;

import lombok.Getter;
import lombok.Setter;

/*
    @created 12/07/2024 8:05 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Getter
@Setter
public class P2CardnumberORUID {
    private String adhaarNumber;
    private int indicatorforUID;
    private String nationalBankIdentificationNumber;
    private String virtualId;
}
