package com.ict.group09.travelwala.contact.repository;

import com.ict.group09.travelwala.contact.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findByEmail(String email);
    Contact findByPhoneNumber(String phoneNumber);
}
