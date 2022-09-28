package com.springBootApp.SpringbootApp.application.service;

import com.springBootApp.SpringbootApp.application.entity.Department;
import com.springBootApp.SpringbootApp.application.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentImpl implements  DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public List<Department> FetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department FetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department UpdateDepartment(Long departmentId, Department department) {
        Department depDb = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentName();
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDb.setDepartmentAddress();
        }
        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDb.setDepartmentCode();
        }

        return departmentRepository.save(depDb);

    }


}
