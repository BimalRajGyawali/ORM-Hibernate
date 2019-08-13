package com.myproject.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.orm.model_many_to_one.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {

}
