package com.mockup.fingpay.dto.response;

import lombok.*;

/*
    @created 12/07/2024 8:14 AM
    @project fingpay
    @author biplaw.chaudhary
*/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalApiResponse<T> {
    private Boolean status;
    private String message;
    private T data;
    private Integer statusCode;
}
