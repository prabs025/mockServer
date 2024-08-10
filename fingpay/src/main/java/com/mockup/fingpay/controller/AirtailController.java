package com.mockup.fingpay.controller;/*
    @created 28/07/2024 1:09 PM
    @project fingpay
    @author prabesh.shrestha
*/

import com.mockup.fingpay.dto.response.ApiResponse;
import com.mockup.fingpay.dto.response.GlobalApiResponse;
import com.mockup.fingpay.dto.response.TransactionDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AirtailController {
    @PostMapping("/ataepsservice/api/aadhaarPay/merchant/pay")
    public ResponseEntity<?> merchantPayApi(
            @RequestHeader String date,
            @RequestHeader (value = "X-Request-ID")String id,
            @RequestHeader(value = "X-Tran-Type") String Type,
            @RequestHeader (value = "X-Access-Channel") String acess,
            @RequestHeader String hash,
            @RequestHeader String authorization,
            @RequestBody String body
    ){
        log.info("Request Headers ---> trnTimeStamp: {}, hash: {}, deviceIMEI: {}, esKey: {}, body:{}",body);


        return new ResponseEntity<>(new TransactionDTO()
               , HttpStatus.OK);
    }
    @PostMapping("/ataepsservice/api/2fa")
    public ResponseEntity<?> twoFactorAuth(

            @RequestBody String body
    ){
        log.info("Request Headers ---> body:{}",
                 body);


        return new ResponseEntity<>(GlobalApiResponse
                .<String>builder(
                )
                .status(true)
                .message("Success from airtailpay.")
                .data("Success 2FA")
                .statusCode(10000)
                .build(), HttpStatus.OK);
    }


}
