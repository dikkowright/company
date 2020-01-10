package com.williams.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveRequest {

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
}
