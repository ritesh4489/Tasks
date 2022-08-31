package com.citiustech.service;

import java.util.List;

import com.citiustech.model.Project;

public interface ProjectService {

	public int addProjectDetails(Project project);

	public String deleteProjectDetails(int projectId);

	public List<Project> listProjectDetails();

	public int updateProjectDetails(int projectId, Project project);

}
