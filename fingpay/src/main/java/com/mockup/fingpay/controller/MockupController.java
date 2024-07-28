package com.mockup.fingpay.controller;

import com.mockup.fingpay.dto.response.ApiResponse;
import com.mockup.fingpay.dto.response.GlobalApiResponse;
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
            @RequestBody String body
    ){
        log.info("Request Headers ---> trnTimeStamp: {}, hash: {}, deviceIMEI: {}, esKey: {}, body:{}",
                trnTimeStamp, hash, deviceIMEI, esKey, body);


        return new ResponseEntity<>(GlobalApiResponse
                .<ApiResponse>builder(
        )
                .status(true)
                .message("Success from fingpay.")
                .data(new ApiResponse())
                .statusCode(10000)
                        .build(), HttpStatus.OK);
    }

    @GetMapping("/test")
    public String getTestDat(){
        return "Test Successful";
    }
}
