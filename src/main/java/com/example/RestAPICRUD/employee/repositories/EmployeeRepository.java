package com.example.RestAPICRUD.employee.repositories;

import com.example.RestAPICRUD.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// you have to use This annotation
// And give the JpaRepository class the name of the entity and id type
@RepositoryRestResource(path = "members")

//http://localhost:8080/magic-api/members?sort=last_name,first_name
// هتكتب المسار دا علشان تعمل الترتيب

// or you could not use teh @Repository at all And the data-rest package will configure
// the path automatically
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // You will not to write any code here
    // because JpaReository class contains
    // all the crud operation that you will need
}

