package com.cicd.projecta.domain;

public class Build {

  String branch;
  Integer buildNumber;
  String result;
  String reason;
  long buildTime;

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public int getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public long getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(long buildTime) {
    this.buildTime = buildTime;
  }

}
