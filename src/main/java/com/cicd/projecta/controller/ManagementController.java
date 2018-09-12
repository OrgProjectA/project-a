package com.cicd.projecta.controller;

import com.cicd.projecta.Service.PivotalTrackerService;
import com.cicd.projecta.domain.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagementController {

  @Autowired
  PivotalTrackerService pivotalTrackerService;

  @RequestMapping(value = "/projects")
  public @ResponseBody List<Project> projectList() throws Exception {

    return pivotalTrackerService.getProjects();
  }
}
