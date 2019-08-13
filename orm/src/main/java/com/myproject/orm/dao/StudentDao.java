package com.myproject.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.orm.model_one_to_one.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
