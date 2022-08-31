package com.citiustech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.dao.ProjectDao;
import com.citiustech.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao projectDao;

	@Override
	public int addProjectDetails(Project project) {
		Project projects=projectDao.save(project);
		return projects.getProjectId();

	}

	@Override
	public String deleteProjectDetails(int projectId) {
		Optional<Project> p = projectDao.findById(projectId);
		if (p != null) {
			projectDao.deleteById(projectId);
		}
		return "deleted";
	}

	@Override
	public List<Project> listProjectDetails() {
		List<Project> plist = (List<Project>) projectDao.findAll();
		return plist;
	}

	@Override
	public int updateProjectDetails(int projectId, Project project) {
		Optional<Project> p = projectDao.findById(projectId);
		Project uproject = p.orElseThrow();
		uproject.setTitle(project.getTitle());
		uproject.setTeamSize(project.getTeamSize());
		uproject.setManagerName(project.getManagerName());
		projectDao.save(uproject);
		
		return uproject.getProjectId();
	}

}
