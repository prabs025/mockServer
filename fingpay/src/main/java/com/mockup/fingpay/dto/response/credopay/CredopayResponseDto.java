package com.mockup.fingpay.dto.response.credopay;

import com.mockup.fingpay.utils.UniqueIdGenerator;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
    @created 10/08/2024 9:46 PM
    @project mockServer
    @author biplaw.chaudhary
*/
@Getter
@Setter
public class CredopayResponseDto {
    private String transaction_type;
    private String response_code;
    private String response_status;
    private String transaction_amount;
    private String customer_name;
    private String date;
    private String time;
    private String response_description;
    private String transaction_id;
    private String rrn;
    private String created_at;
    private String balance;

    public CredopayResponseDto() {
        this.transaction_type = "cw/ms/ap/";
        this.response_code = "00";
        this.response_status = "success";
        this.transaction_amount = "000";
        this.customer_name = "Test Name";
        this.date = String.valueOf(LocalDate.now());
        this.time = String.valueOf(LocalTime.now());
        this.response_description = "response_description";
        this.transaction_id = String.valueOf(UniqueIdGenerator.generateUniqueId());
        this.rrn = String.valueOf(UniqueIdGenerator.generateUniqueId());
        this.created_at = LocalDateTime.now().toString();
        this.balance = "0000";
    }
}
