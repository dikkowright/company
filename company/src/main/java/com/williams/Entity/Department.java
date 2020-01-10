//package com.williams.Entity;
//
//import com.williams.constant.Status;
//
//import javax.persistence.Entity;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//import java.awt.*;
//import java.io.Serializable;
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.Objects;
//
//@Entity
//@Table(name = "department")
//public class Department implements Serializable {
//
//    private Integer id;
//    private String uniqueKey;
//    private String name;
//    private String description;
//    private Status status;
//    private Timestamp createdAt;
//    private Timestamp updatedAt;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUniqueKey() {
//        return uniqueKey;
//    }
//
//    public void setUniqueKey(String uniqueKey) {
//        this.uniqueKey = uniqueKey;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public Timestamp getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Timestamp createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Timestamp getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Timestamp updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Department that = (Department) o;
//        return Objects.equals(id, that.id) &&
//                Objects.equals(uniqueKey, that.uniqueKey) &&
//                Objects.equals(name, that.name) &&
//                Objects.equals(description, that.description) &&
//                status == that.status &&
//                Objects.equals(createdAt, that.createdAt) &&
//                Objects.equals(updatedAt, that.updatedAt);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, uniqueKey, name, description, status, createdAt, updatedAt);
//    }
//
//    @PrePersist
//    public void beforeSave(){ this.createdAt = new Timestamp(new Date().getTime());}
//
//    @PreUpdate
//    public void beforeUpdate(){this.updatedAt = new Timestamp(new Date().getTime());}
//}
