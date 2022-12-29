package com.ict.group09.travelwala.passenger.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class Passenger {
    private String id;

    private String title;

    private String firstName;

    private String lastName;

    private String dob;

    private String nationality;
}
