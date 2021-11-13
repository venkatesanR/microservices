package com.microservices.licensing.database.entity;

import lombok.Data;

@Data
public class Organization {
    String id;
    String name;
    String contactName;
    String contactEmail;
    String contactPhone;
}
