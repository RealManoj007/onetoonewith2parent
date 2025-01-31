package com.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
