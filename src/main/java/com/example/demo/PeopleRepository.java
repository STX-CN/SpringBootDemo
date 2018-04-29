package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer>{
	public List<People> findByAge(Integer age);
}
