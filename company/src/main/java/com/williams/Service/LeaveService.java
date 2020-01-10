package com.williams.Service;

import com.williams.DAO.LeaveDao;
import com.williams.Entity.LeaveEntity;
import com.williams.Request.LeaveRequest;
import com.williams.Response.LeaveResponse;
import com.williams.ResponseList.LeaveResponseList;

public class LeaveService {

    private final LeaveDao leaveDao = new LeaveDao();

    public LeaveEntity toSaveEmployeeLEave(LeaveRequest leaveRequest){
        LeaveEntity toSaveEmployeeLeaveRecord = leaveDao.toSaveEmployeeLEave(leaveRequest);
        return toSaveEmployeeLeaveRecord;
    }

    public LeaveResponse getLeaveInfo(Long id){
        LeaveResponse leaveResponse = leaveDao.getLeaveInfo(id);
        return  leaveResponse;
    }

    public LeaveResponseList getAllLeaveInfo(){
        LeaveResponseList leaveResponseList = leaveDao.getAllLeaveInfo();
        return leaveResponseList;
    }

    public LeaveResponse employeeLeaveToUpdate(Long id, LeaveRequest leaveRequest) {
        LeaveEntity updateEmployee = leaveDao.employeeLeaveToUpdate(id, leaveRequest);
        LeaveResponse leaveResponse = new LeaveResponse();
        leaveResponse.setAge(updateEmployee.getAge());
        leaveResponse.setCreatedAt(updateEmployee.getCreatedAt());
        leaveResponse.setDateToEndLeave(updateEmployee.getDateToEndLeave());
        leaveResponse.setDateToStartLeave(updateEmployee.getDateToStartLeave());
        leaveResponse.setEmployeeNumber(updateEmployee.getEmployeeNumber());
        leaveResponse.setFirstName(updateEmployee.getFirstName());
        leaveResponse.setLevel(updateEmployee.getLevel());
        leaveResponse.setMaritalStatus(updateEmployee.getMaritalStatus());
        leaveResponse.setMiddleName(updateEmployee.getMiddleName());
        leaveResponse.setNameOfSchool(updateEmployee.getNameOfSchool());
        leaveResponse.setSex(updateEmployee.getSex());
        leaveResponse.setSurName(updateEmployee.getSurName());
        leaveResponse.setUpdatedAt(updateEmployee.getUpdatedAt());
        leaveResponse.setYearOfLeave(updateEmployee.getYearOfLeave());
        return leaveResponse;
    }
}
