package com.microservices.licensing.database.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Organization {
    private String organizationId;
    private String name;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
}