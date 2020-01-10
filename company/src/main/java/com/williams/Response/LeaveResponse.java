package com.williams.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveResponse {

    private  Long employeeNumber;
    private String surName;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private String maritalStatus;
    private String nameOfSchool;
    private String level;
    private String dateToStartLeave;
    private String dateToEndLeave;
    private String yearOfLeave;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String uniqueKey;
}
