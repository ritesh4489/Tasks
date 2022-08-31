package com.citiustech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.citiustech.model.Project;
import com.citiustech.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@PostMapping(value="/product")
	public String addProjectDetails(@RequestBody Project project) {

		int id = projectService.addProjectDetails(project);

		return "Added>>" + id;
	}

	@PutMapping(value="/product/{id}")
	public String updateProjectDetails(@PathVariable("id") int projectId, @RequestBody Project project) {
		System.out.println("controller called");
		int id =projectService.updateProjectDetails(projectId, project);
		return "Updated>>" + id;
	}

	@DeleteMapping(value="/product/{id}")
	public String deleteProject(@PathVariable("id") int projectId) {

		String s =projectService.deleteProjectDetails(projectId);

		return s;
	}

	@GetMapping(value="/product")
	public List<Project> getProjectList() {

		List<Project> list = projectService.listProjectDetails();

		return list;
	}

}
