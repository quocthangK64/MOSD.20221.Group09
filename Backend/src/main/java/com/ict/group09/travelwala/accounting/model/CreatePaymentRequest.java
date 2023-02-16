package com.ict.group09.travelwala.accounting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreatePaymentRequest {
    private Long amount;
    private String currency;
}
