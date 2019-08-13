package com.myproject.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.orm.model_one_to_one.Laptop;

@Repository
public interface LaptopDao extends JpaRepository<Laptop, Integer> {

}
