package com.mockup.fingpay.controller;

import com.mockup.fingpay.dto.request.CredopayRequestDto;
import com.mockup.fingpay.dto.request.CredopayTransactionCompleteRequestDto;
import com.mockup.fingpay.dto.response.credopay.CredopayResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/*
    @created 09/08/2024 11:24 PM
    @project mockServer
    @author biplaw.chaudhary
*/
@Slf4j
@RestController
public class CredopayController {

    @PostMapping("/v10/transactions/aeps/authentication")
    public ResponseEntity<?> processTransaction(@RequestBody CredopayRequestDto credopayRequestDto){

        log.info("Request Received in credopay {}", credopayRequestDto);

//        String successResponse = """
//                {
//                "transaction_type":"cash_withdrawal",
//                "response_code":"00",
//                "response_status":"TXN DONE SUCCESSFULLY",
//                "transaction_amount":"",
//                "customer_name":"",
//                "date":"20221215",
//                "time":"”
//                "response_description":"TXN DONE SUCCESSFULLY",
//                "transaction_id":"639aef6fc2369c56479a6358",
//                "rrn":"234915131381",
//                "created_at":"2022-12-15 15:27:03",
//                "balance":"₹9988.00"
//                }
//                """;
//
//        String failureResposne = """
//                {
//                  "response_description": "Invalid certificate identifier in ci attribute of Skey",
//                 "errors": [],
//                 "transaction_id": "65840eda18c3744fa3ab3005"
//                 }
//                """;
//        List<String> dataResposneString = List.of(successResponse, failureResposne);
//        Random random = new Random();
        return new ResponseEntity<>(new CredopayResponseDto(), HttpStatus.OK);
    }


    @PostMapping("/v1.0/transactions/aeps/complete")
    public ResponseEntity<?> completeTransaction(@RequestBody CredopayTransactionCompleteRequestDto requestDto){
        log.info("Request Received for completion of transaction: {}", requestDto);
        return new ResponseEntity<>(Map.of("status", "success"), HttpStatus.OK);
    }

    @PostMapping("/cpaepsservice/api/2fa")
    public ResponseEntity<?> twoFactorAuthCredoPay(

            @RequestBody CredopayRequestDto body,
            @RequestParam(required = false,defaultValue = "true") Boolean status
    ){
        log.info("Request Headers ---> body:{}",
                body);
        Map<String, String> transactionData = new HashMap<>();
        transactionData.put("transaction_type", "Authentication");
        transactionData.put("response_code", "00");
        transactionData.put("response_status", "Authentication Successful");
        transactionData.put("customer_name", "");
        transactionData.put("date", "20221215");
        transactionData.put("time", "");
        transactionData.put("auth_reference_no", "335511138989");
        transactionData.put("response_description", "Authentication Successful");
        transactionData.put("transaction_id", "639aef6fc2369c56479a6358");
        transactionData.put("created_at", "2022-12-15 15:27:03");

        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("response_description", "Invalid certificate identifier in ci attribute of Skey");
        errorResponse.put("errors", new ArrayList<>()); // Empty list
        errorResponse.put("transaction_id", "65840eda18c3744fa3ab3005");
        return new ResponseEntity<>(status?transactionData:errorResponse,HttpStatus.OK);
    }
}
