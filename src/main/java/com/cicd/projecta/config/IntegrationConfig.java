package com.cicd.projecta.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "integration")
public class IntegrationConfig {

  public IntegrationConfig() {

  }
  private Pivotal pivotal;

  public void setPivotal(Pivotal pivotal) {
    this.pivotal = pivotal;
  }

  public Pivotal getPivotal() {
    return pivotal;
  }

  public static class Pivotal {
    private String url;
    private String key;

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public String getKey() {
      return key;
    }

    public void setKey(String key) {
      this.key = key;
    }
  }


  private Circleci circleci;

  public Circleci getCircleci() {
    return circleci;
  }

  public void setCircleci(Circleci circleci) {
    this.circleci = circleci;
  }

  public static class Circleci {
    private String url;
    private String key;

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public String getKey() {
      return key;
    }

    public void setKey(String key) {
      this.key = key;
    }
  }
}
