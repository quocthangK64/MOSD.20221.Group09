package com.ict.group09.travelwala.accounting.service;

import com.ict.group09.travelwala.model.response.InvoiceResponse;

public interface IUpdateInvoiceStatus {
    InvoiceResponse completeInvoice(String invoiceId);
    InvoiceResponse cancelInvoice(String invoiceId);
}
