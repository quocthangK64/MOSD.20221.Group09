package com.ict.group09.travelwala.contact.service;

import com.ict.group09.travelwala.model.request.ContactRequest;
import com.ict.group09.travelwala.model.response.ContactResponse;

public interface ISaveContact {
    ContactResponse saveContact(ContactRequest contact);
}
