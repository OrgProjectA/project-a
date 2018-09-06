package com.cicd.projecta.repository;

import com.cicd.projecta.config.IntegrationConfig;
import com.cicd.projecta.config.IntegrationConfig.Pivotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PivotalTrackerRepositoryImpl implements ProjectManagementRepository {

  private IntegrationConfig integrationConfig;
  private HttpEntity entity;

  @Autowired
  PivotalTrackerRepositoryImpl(IntegrationConfig integrationConfig){
    this.integrationConfig = integrationConfig;
  }

  @Override
  public void authenticate() {
    HttpHeaders headers = new HttpHeaders();
    headers.set("X-TrackerToken", integrationConfig.pivotal.getKey());
    entity = new HttpEntity(headers);
  }

  public String getProject() {
    Pivotal pivotal = integrationConfig.getPivotal();
    String baseurl = pivotal.getUrl();

    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> project = restTemplate.exchange(baseurl + "projects", HttpMethod.GET, entity, String.class);

    return project.getBody();
  }
}
