package com.ict.group09.travelwala.accounting.service;

import com.ict.group09.travelwala.model.response.InvoiceResponse;

public interface ICreateInvoice {
    InvoiceResponse createInvoice(String bookingId, double totalAmount);
}
