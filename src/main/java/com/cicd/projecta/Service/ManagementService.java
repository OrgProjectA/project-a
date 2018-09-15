package com.cicd.projecta.Service;


import com.cicd.projecta.domain.Project;
import com.cicd.projecta.repository.PivotalTrackerRepositoryImpl;
import com.cicd.projecta.repository.ThirdPartyException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementService {

  @Autowired
  PivotalTrackerRepositoryImpl pivotalTrackerRepository;

  public List<Project> getProjects() throws ThirdPartyException {
    List<com.cicd.projecta.domain.thirdparty.PivotalTracker.Project> pivotal_projects = pivotalTrackerRepository.getProject();

    if(pivotal_projects.isEmpty()) {
      throw new ThirdPartyException("Project did not return anything.");
    }
    List<Project> projects = new ArrayList<Project>();

    for(com.cicd.projecta.domain.thirdparty.PivotalTracker.Project pivotal_project : pivotal_projects) {
      Project tmp_project = new Project();

      tmp_project.setName(pivotal_project.getName());

      projects.add(tmp_project);
    }
    return projects;
  }
}
