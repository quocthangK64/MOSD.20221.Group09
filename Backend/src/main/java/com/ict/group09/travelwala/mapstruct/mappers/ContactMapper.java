package com.ict.group09.travelwala.mapstruct.mappers;

import com.ict.group09.travelwala.contact.entity.Contact;
import com.ict.group09.travelwala.model.request.ContactRequest;
import com.ict.group09.travelwala.model.response.ContactResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ContactMapper {
    Contact contactRequestToContact(ContactRequest contactRequest);
    ContactResponse contactToContactResponse(Contact contact);
}
