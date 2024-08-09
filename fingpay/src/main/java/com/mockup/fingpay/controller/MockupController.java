package com.mockup.fingpay.controller;

import com.mockup.fingpay.dto.response.ApiResponse;
import com.mockup.fingpay.dto.response.GlobalApiResponse;
import com.mockup.fingpay.dto.response.TransactionResponseFailureDto;
import com.mockup.fingpay.service.MockupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
    @created 12/07/2024 8:06 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Slf4j
@RestController
@RequiredArgsConstructor
public class MockupController {
    private final MockupService mockupService;

    @PostMapping("/fpaepsservice/api/aadhaarPay/merchant/pay")
    public ResponseEntity<?> merchantPayApi(
            @RequestHeader String trnTimeStamp,
            @RequestHeader String hash,
            @RequestHeader String deviceIMEI,
            @RequestHeader String esKey,
            @RequestBody String body,
            @RequestParam(required = false,defaultValue = "CW") String type,
            @RequestParam(required = false,defaultValue = "true")Boolean success
    ){
        log.info("Request Headers ---> trnTimeStamp: {}, hash: {}, deviceIMEI: {}, esKey: {}, body:{}",
                trnTimeStamp, hash, deviceIMEI, esKey, body);


        if(success){
            return new ResponseEntity<>(GlobalApiResponse
                    .<ApiResponse>builder(
                    )
                    .status(true)
                    .message("Request Completed")
                    .data(new ApiResponse(type))
                    .statusCode(10000)
                    .build(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(GlobalApiResponse
                    .<TransactionResponseFailureDto>builder(
                    )
                    .status(false)
                    .message("Fingerprint did not matched with Aadhaar, please try another finger")
                    .data(new TransactionResponseFailureDto(type))
                    .statusCode(10004)
                    .build(), HttpStatus.OK);
        }


    }




    @PostMapping("/fpaepsservice/api/2fa")
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
