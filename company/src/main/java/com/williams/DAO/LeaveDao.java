package com.williams.DAO;

import com.williams.Entity.LeaveEntity;
import com.williams.Request.LeaveRequest;
import com.williams.Response.LeaveResponse;
import com.williams.ResponseList.LeaveResponseList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.ws.rs.ProcessingException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDao {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    Query query;

    public LeaveEntity toSaveEmployeeLEave(LeaveRequest leaveRequest){
        LeaveEntity saveLeaveInfo = new LeaveEntity();
        saveLeaveInfo.setAge(leaveRequest.getAge());
        saveLeaveInfo.setDateToEndLeave(leaveRequest.getDateToEndLeave());
        saveLeaveInfo.setDateToStartLeave(leaveRequest.getDateToStartLeave());
        saveLeaveInfo.setFirstName(leaveRequest.getFirstName());
        saveLeaveInfo.setLevel(leaveRequest.getLevel());
        saveLeaveInfo.setMaritalStatus(leaveRequest.getMaritalStatus());
        saveLeaveInfo.setMiddleName(leaveRequest.getMiddleName());
        saveLeaveInfo.setNameOfSchool(leaveRequest.getNameOfSchool());
        saveLeaveInfo.setSex(leaveRequest.getSex());
        saveLeaveInfo.setSurName(leaveRequest.getSurName());
        saveLeaveInfo.setYearOfLeave(leaveRequest.getYearOfLeave());
        session.save(saveLeaveInfo);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return saveLeaveInfo;
    }

    public LeaveResponse getLeaveInfo(Long leaveEntity){
        LeaveEntity saveLeaveInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity where id=:id");
        query.setParameter("id",leaveEntity);
        saveLeaveInfo = (LeaveEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        LeaveResponse leaveInfo = new LeaveResponse();
        leaveInfo.setAge(saveLeaveInfo.getAge());
        leaveInfo.setCreatedAt(saveLeaveInfo.getCreatedAt());
        leaveInfo.setDateToEndLeave(saveLeaveInfo.getDateToEndLeave());
        leaveInfo.setDateToStartLeave(saveLeaveInfo.getDateToStartLeave());
        leaveInfo.setEmployeeNumber(saveLeaveInfo.getEmployeeNumber());
        leaveInfo.setFirstName(saveLeaveInfo.getFirstName());
        leaveInfo.setLevel(saveLeaveInfo.getLevel());
        leaveInfo.setMaritalStatus(saveLeaveInfo.getMaritalStatus());
        leaveInfo.setMiddleName(saveLeaveInfo.getMiddleName());
        leaveInfo.setNameOfSchool(saveLeaveInfo.getNameOfSchool());
        leaveInfo.setSex(saveLeaveInfo.getSex());
        leaveInfo.setSurName(saveLeaveInfo.getSurName());
        leaveInfo.setUpdatedAt(saveLeaveInfo.getUpdatedAt());
        leaveInfo.setYearOfLeave(saveLeaveInfo.getYearOfLeave());
        leaveInfo.setUniqueKey(saveLeaveInfo.getUniqueKey());
        return leaveInfo;
    }

    public LeaveResponseList getAllLeaveInfo(){
        List<LeaveEntity> getAllInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity");
        getAllInfo =(List<LeaveEntity> ) query.list();
        session.getTransaction().commit();
        session.close();
        LeaveResponseList leaveResponseList = new LeaveResponseList();
        List<LeaveResponse> leaveResponses = new ArrayList<>();
        for(LeaveEntity leaveEntity : getAllInfo){
            LeaveResponse leaveResponse = new LeaveResponse();
           leaveResponse.setYearOfLeave(leaveEntity.getYearOfLeave());
           leaveResponse.setUpdatedAt(leaveEntity.getUpdatedAt());
           leaveResponse.setSurName(leaveEntity.getSurName());
           leaveResponse.setSex(leaveEntity.getSex());
           leaveResponse.setNameOfSchool(leaveEntity.getNameOfSchool());
           leaveResponse.setMiddleName(leaveEntity.getMiddleName());
           leaveResponse.setMaritalStatus(leaveEntity.getMaritalStatus());
           leaveResponse.setLevel(leaveEntity.getLevel());
           leaveResponse.setFirstName(leaveEntity.getFirstName());
           leaveResponse.setEmployeeNumber(leaveEntity.getEmployeeNumber());
           leaveResponse.setDateToStartLeave(leaveEntity.getDateToStartLeave());
           leaveResponse.setDateToEndLeave(leaveEntity.getDateToEndLeave());
           leaveResponse.setCreatedAt(leaveEntity.getCreatedAt());
           leaveResponse.setAge(leaveEntity.getAge());
           leaveResponse.setUniqueKey(leaveEntity.getUniqueKey());
           leaveResponses.add(leaveResponse);
        }
        leaveResponseList.setLeaveResponses(leaveResponses);
        return leaveResponseList;
    }

    public LeaveEntity employeeLeaveToUpdate(Long idOfEmployeeToUpdate, LeaveRequest leaveRequest) {
        LeaveEntity employeeToUpdate = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity where id=:id");
        query.setParameter("id", idOfEmployeeToUpdate);
        employeeToUpdate = (LeaveEntity) query.uniqueResult();
        if (employeeToUpdate == null) {
            throw new ProcessingException("Employee does not exist!");
        }
        employeeToUpdate.setYearOfLeave(leaveRequest.getYearOfLeave());
        employeeToUpdate.setSurName(leaveRequest.getSurName());
        employeeToUpdate.setSex(leaveRequest.getSex());
        employeeToUpdate.setNameOfSchool(leaveRequest.getNameOfSchool());
        employeeToUpdate.setMiddleName(leaveRequest.getMiddleName());
        employeeToUpdate.setMaritalStatus(leaveRequest.getMaritalStatus());
        employeeToUpdate.setLevel(leaveRequest.getLevel());
        employeeToUpdate.setFirstName(leaveRequest.getFirstName());
        employeeToUpdate.setDateToStartLeave(leaveRequest.getDateToStartLeave());
        employeeToUpdate.setDateToEndLeave(leaveRequest.getDateToEndLeave());
        employeeToUpdate.setAge(leaveRequest.getAge());
        session.getTransaction().commit();
        session.close();
        return employeeToUpdate;
    }
}
