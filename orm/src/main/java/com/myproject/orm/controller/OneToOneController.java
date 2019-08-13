package com.myproject.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.orm.dao.LaptopDao;
import com.myproject.orm.dao.StudentDao;
import com.myproject.orm.model_one_to_one.Laptop;
import com.myproject.orm.model_one_to_one.Student;

@RestController
public class OneToOneController {
	@Autowired
	StudentDao studentDao;

	@Autowired
	LaptopDao laptopDao;
	
	@RequestMapping(value="one-to-one", method = RequestMethod.GET)
	public String oneToOne()
	{
		
		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setBrand("Dell");
		laptopDao.save(laptop);

		Student student = new Student();
		student.setRoll(2);
		student.setFname("Ram");
		student.setLname("Kumar");
		student.setLaptop(laptop);
		
		studentDao.save(student);
		
	  return "One To One";
	}
	

}
