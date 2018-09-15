package com.cicd.projecta.Service;


import com.cicd.projecta.config.IntegrationConfig;
import com.cicd.projecta.domain.Build;
import com.cicd.projecta.repository.CircleCIRepositoryImpl;
import com.cicd.projecta.repository.ThirdPartyException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class BuildService {

  IntegrationConfig integrationConfig;
  CircleCIRepositoryImpl circleCIRepository;

  @Autowired
  public BuildService(IntegrationConfig integrationConfig, CircleCIRepositoryImpl circleCIRepository) {
    this.integrationConfig = integrationConfig;
    this.circleCIRepository = circleCIRepository;
  }


  public Build getBuildStatus() {

    List<com.cicd.projecta.domain.thirdparty.CircleCI.Build> circleBuilds = circleCIRepository.getBuildSummary();
    com.cicd.projecta.domain.thirdparty.CircleCI.Build buildSummary = circleBuilds.get(0);

    //TODO need exception handling
    if(circleBuilds.isEmpty()) {
      System.out.println("Didn't get valid response.");
//       throw new ThirdPartyException("Didn't get valid response.");
    }
    Build build = new Build();

    build.setBranch(buildSummary.getBranch());
    if(buildSummary.getBuildNum() != null) {
      build.setBuildNumber(buildSummary.getBuildNum());
    } else {
      build.setBuildNumber(0);
    }
    if(buildSummary.getBuildTimeMillis() != null) {
      build.setBuildTime(buildSummary.getBuildTimeMillis());
    }
    if(!StringUtils.isEmpty(buildSummary.getStatus())) {
      build.setResult(buildSummary.getStatus());
    } else if(!StringUtils.isEmpty(buildSummary.getOutcome())) {
      build.setResult(buildSummary.getOutcome());
    }

    if(!StringUtils.isEmpty(buildSummary.getCanceled()) && buildSummary.getCanceled().equals("true")) {
      build.setResult("Canceled");
    }

    if(buildSummary.getFailed()) {
      build.setResult("Failed");
      build.setReason(buildSummary.getFailReason());
    }

    return build;
  }


}
