package com.williams.Entity;

import com.williams.Controller.LeaveController;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "leaveinfo")
public class LeaveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long employeeNumber;
    private String uniqueKey;
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
    @Column(name = "createdAt", updatable=false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Timestamp updatedAt;

    public Long getEmployeeNumber() {
        return employeeNumber;
    }


    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDateToStartLeave() {
        return dateToStartLeave;
    }

    public void setDateToStartLeave(String dateToStartLeave) {
        this.dateToStartLeave = dateToStartLeave;
    }

    public String getDateToEndLeave() {
        return dateToEndLeave;
    }

    public void setDateToEndLeave(String dateToEndLeave) {
        this.dateToEndLeave = dateToEndLeave;
    }

    public String getYearOfLeave() {
        return yearOfLeave;
    }

    public void setYearOfLeave(String yearOfLeave) {
        this.yearOfLeave = yearOfLeave;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveEntity that = (LeaveEntity) o;
        return Objects.equals(employeeNumber, that.employeeNumber) &&
                Objects.equals(uniqueKey, that.uniqueKey) &&
                Objects.equals(surName, that.surName) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(age, that.age) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(nameOfSchool, that.nameOfSchool) &&
                Objects.equals(level, that.level) &&
                Objects.equals(dateToStartLeave, that.dateToStartLeave) &&
                Objects.equals(dateToEndLeave, that.dateToEndLeave) &&
                Objects.equals(yearOfLeave, that.yearOfLeave) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employeeNumber, uniqueKey, surName, firstName, middleName, sex, age, maritalStatus, nameOfSchool, level, dateToStartLeave, dateToEndLeave, yearOfLeave, createdAt, updatedAt);
    }
}
