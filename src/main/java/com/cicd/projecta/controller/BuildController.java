package com.cicd.projecta.controller;

import com.cicd.projecta.Service.BuildService;
import com.cicd.projecta.domain.Build;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuildController {

  @Autowired
  BuildService buildService;

  @RequestMapping(value = "/lastBuild", method = RequestMethod.GET)
  public @ResponseBody Build getLastBuildStatus() {

    return buildService.getBuildStatus();
  }
}
