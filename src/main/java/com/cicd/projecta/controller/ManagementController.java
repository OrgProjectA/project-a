package com.cicd.projecta.controller;

import com.cicd.projecta.Service.ManagementService;
import com.cicd.projecta.domain.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagementController {

  @Autowired
  ManagementService managementService;

  @RequestMapping(value = "/projects", method = RequestMethod.GET)
  public @ResponseBody List<Project> projectList() throws Exception {

    return managementService.getProjects();
  }
}
