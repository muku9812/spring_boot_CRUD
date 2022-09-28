package com.springBootApp.SpringbootApp.application.service;

import com.springBootApp.SpringbootApp.application.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

  public  List<Department> FetchDepartmentList();

   public Department FetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public
   Department UpdateDepartment(Long departmentId, Department department);
}
