package com.myproject.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.orm.model_many_to_many.Subscriber;

public interface SubscriberDao extends JpaRepository<Subscriber, String>{

}
