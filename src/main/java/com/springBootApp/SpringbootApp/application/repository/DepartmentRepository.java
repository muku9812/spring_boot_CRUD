package com.springBootApp.SpringbootApp.application.repository;

import com.springBootApp.SpringbootApp.application.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
