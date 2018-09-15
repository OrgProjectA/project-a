package com.cicd.projecta.repository;

import com.cicd.projecta.config.IntegrationConfig;
import com.cicd.projecta.config.IntegrationConfig.Pivotal;
import com.cicd.projecta.domain.thirdparty.PivotalTracker.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PivotalTrackerRepositoryImpl extends RestBuilder implements
    ProjectManagementRepository {

  private RestTemplateBuilder restTemplateBuilder;
  private IntegrationConfig integrationConfig;
  private static HttpEntity entity;

  @Autowired
  PivotalTrackerRepositoryImpl(IntegrationConfig integrationConfig, RestTemplateBuilder restTemplateBuilder) {
    this.integrationConfig = integrationConfig;
    this.restTemplateBuilder = restTemplateBuilder;

    init();
  }

  private void init() {
    HttpHeaders headers = new HttpHeaders();
    headers.set("X-TrackerToken", integrationConfig.pivotal.getKey());
    entity = new HttpEntity(headers);
  }

  @Override
  public void authenticate() {

  }

  public List<Project> getProject() {
    Pivotal pivotal = integrationConfig.getPivotal();
    String baseurl = pivotal.getUrl();

    RestTemplate restTemplate = build(restTemplateBuilder);
    HttpEntity<List<Project>> project = restTemplate
        .exchange(baseurl + "projects", HttpMethod.GET, entity,
            new ParameterizedTypeReference<List<Project>>() {
            });

    return project.getBody();
  }
}
