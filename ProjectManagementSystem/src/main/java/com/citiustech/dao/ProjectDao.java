package com.citiustech.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.model.Project;

@Repository
public interface ProjectDao  extends CrudRepository<Project, Integer>{

}
