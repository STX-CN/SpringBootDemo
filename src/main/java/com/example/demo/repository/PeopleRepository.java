package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.People;

public interface PeopleRepository extends JpaRepository<People, Integer>{
	public List<People> findByAge(Integer age);
}
