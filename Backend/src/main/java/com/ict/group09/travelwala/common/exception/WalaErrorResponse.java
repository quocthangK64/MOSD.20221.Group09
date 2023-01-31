package com.ict.group09.travelwala.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WalaErrorResponse {
    private String type;
    private String message;
    private int code;
}
