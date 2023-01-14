package com.ict.group09.travelwala.mapstruct.mappers;

import com.ict.group09.travelwala.accounting.entity.Invoice;
import com.ict.group09.travelwala.model.response.InvoiceResponse;
import org.mapstruct.Mapper;

@Mapper
public interface InvoiceMapper {
    InvoiceResponse invoiceToInvoiceResponse(Invoice invoice);
}
