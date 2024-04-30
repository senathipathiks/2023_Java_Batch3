package com.ems.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ems.bean.Employee;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

    @Query("select eid from Employee order by eid asc")
    public List<Object> getIdList();

    @Query("select ename from Employee order by ename asc")
    public List<Object> getNameList();

    @Transactional
    public void deleteByEname(String ename);

    public List<Employee> findByEname(String ename);

}
