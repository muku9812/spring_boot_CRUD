package com.springBootApp.SpringbootApp.application.controller;

import com.springBootApp.SpringbootApp.application.entity.Department;
import com.springBootApp.SpringbootApp.application.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("department/save")
public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

}
@GetMapping("department/index")
public List<Department> FetchDepartmentList(){
        return departmentService.FetchDepartmentList();

}

@GetMapping("/department/{id}")
public Department FetchDepartmentById(@PathVariable("id") Long departmentId){
    return departmentService.FetchDepartmentById(departmentId);
}

@DeleteMapping("department/{id}")
public String deleteDepartmentById(@PathVariable("id") Long departmentId){
    departmentService.deleteDepartmentById(departmentId);
return "Department Deleted successfully";
}
    @PutMapping("/department/{id}")
    public Department UpdateDepartment(@PathVariable Long departmentId, @RequestBody Department department){
        return departmentService.UpdateDepartment(departmentId,department);

    }

}
