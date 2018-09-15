package com.cicd.projecta.repository;

import com.cicd.projecta.config.IntegrationConfig;
import com.cicd.projecta.config.IntegrationConfig.Circleci;
import com.cicd.projecta.domain.thirdparty.CircleCI.Build;
import com.cicd.projecta.domain.thirdparty.PivotalTracker.Project;
import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CircleCIRepositoryImpl extends RestBuilder implements ContinousIntegrationRepository {

  RestTemplateBuilder restTemplateBuilder;
  IntegrationConfig integrationConfig;
  private static HttpEntity entity;

  @Autowired
  public CircleCIRepositoryImpl(RestTemplateBuilder restTemplateBuilder, IntegrationConfig integrationConfig) {
    this.restTemplateBuilder = restTemplateBuilder;
    this.integrationConfig = integrationConfig;

    init();
  }

  private void init() {
    HttpHeaders headers = new HttpHeaders();

    String userpass = integrationConfig.getCircleci().getKey() + ":";
    String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));

    headers.set("Authorization", basicAuth);
    entity = new HttpEntity(headers);
  }

  @Override
  public void authenticate() {

  }

  public List<Build> getBuildSummary() {

    Circleci circleci = integrationConfig.getCircleci();
    String baseurl = circleci.getUrl();

    RestTemplate restTemplate = build(restTemplateBuilder);
    HttpEntity<List<Build>> httpEntity = restTemplate.exchange(baseurl + "project/github/OrgProjectA/project-a?limit=1",
        HttpMethod.GET, entity, new ParameterizedTypeReference<List<Build>>() {});

    return httpEntity.getBody();
  }
}
