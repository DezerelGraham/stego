package com.stego.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String employeeId;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String jobTitle;
    private byte[] employeeImage;
    private PersonalInformation personalInformation;
}
