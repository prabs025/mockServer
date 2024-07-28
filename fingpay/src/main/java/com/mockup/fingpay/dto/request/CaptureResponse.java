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
public class CaptureResponse {
    private String errCode;
    private String errInfo;
    private String fCount;
    private String fType;
    private String iCount;
    private String iType;
    private String pCount;
    private String pType;
    private String nmPoints;
    private String qScore;
    private String dpID;
    private String rdsID;
    private String rdsVer;
    private String dc;
    private String mi;
    private String mc;
    private String ci;
    private String sessionKey;
    private String hmac;
    private String PidDatatype;
    private String Piddata;
}
