package com.cicd.projecta.domain.thirdparty.PivotalTracker;

public class Project {

  private Integer id;
  private String kind;
  private String name;
  private Integer version;
  private Integer iterationLength;
  private String weekStartDay;
  private String pointScale;
  private Boolean pointScaleIsCustom;
  private Boolean bugsAndChoresAreEstimatable;
  private Boolean automaticPlanning;
  private Boolean enableTasks;
  private TimeZone timeZone;
  private Integer velocityAveragedOver;
  private Integer numberOfDoneIterationsToShow;
  private Boolean hasGoogleDomain;
  private String description;
  private Boolean enableIncomingEmails;
  private Integer initialVelocity;
  private Boolean _public;
  private Boolean atomEnabled;
  private String projectType;
  private String startTime;
  private String createdAt;
  private String updatedAt;
  private Integer accountId;
  private Integer currentIterationNumber;
  private Boolean enableFollowing;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getIterationLength() {
    return iterationLength;
  }

  public void setIterationLength(Integer iterationLength) {
    this.iterationLength = iterationLength;
  }

  public String getWeekStartDay() {
    return weekStartDay;
  }

  public void setWeekStartDay(String weekStartDay) {
    this.weekStartDay = weekStartDay;
  }

  public String getPointScale() {
    return pointScale;
  }

  public void setPointScale(String pointScale) {
    this.pointScale = pointScale;
  }

  public Boolean getPointScaleIsCustom() {
    return pointScaleIsCustom;
  }

  public void setPointScaleIsCustom(Boolean pointScaleIsCustom) {
    this.pointScaleIsCustom = pointScaleIsCustom;
  }

  public Boolean getBugsAndChoresAreEstimatable() {
    return bugsAndChoresAreEstimatable;
  }

  public void setBugsAndChoresAreEstimatable(Boolean bugsAndChoresAreEstimatable) {
    this.bugsAndChoresAreEstimatable = bugsAndChoresAreEstimatable;
  }

  public Boolean getAutomaticPlanning() {
    return automaticPlanning;
  }

  public void setAutomaticPlanning(Boolean automaticPlanning) {
    this.automaticPlanning = automaticPlanning;
  }

  public Boolean getEnableTasks() {
    return enableTasks;
  }

  public void setEnableTasks(Boolean enableTasks) {
    this.enableTasks = enableTasks;
  }

  public TimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public Integer getVelocityAveragedOver() {
    return velocityAveragedOver;
  }

  public void setVelocityAveragedOver(Integer velocityAveragedOver) {
    this.velocityAveragedOver = velocityAveragedOver;
  }

  public Integer getNumberOfDoneIterationsToShow() {
    return numberOfDoneIterationsToShow;
  }

  public void setNumberOfDoneIterationsToShow(Integer numberOfDoneIterationsToShow) {
    this.numberOfDoneIterationsToShow = numberOfDoneIterationsToShow;
  }

  public Boolean getHasGoogleDomain() {
    return hasGoogleDomain;
  }

  public void setHasGoogleDomain(Boolean hasGoogleDomain) {
    this.hasGoogleDomain = hasGoogleDomain;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getEnableIncomingEmails() {
    return enableIncomingEmails;
  }

  public void setEnableIncomingEmails(Boolean enableIncomingEmails) {
    this.enableIncomingEmails = enableIncomingEmails;
  }

  public Integer getInitialVelocity() {
    return initialVelocity;
  }

  public void setInitialVelocity(Integer initialVelocity) {
    this.initialVelocity = initialVelocity;
  }

  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public Boolean getAtomEnabled() {
    return atomEnabled;
  }

  public void setAtomEnabled(Boolean atomEnabled) {
    this.atomEnabled = atomEnabled;
  }

  public String getProjectType() {
    return projectType;
  }

  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public Integer getCurrentIterationNumber() {
    return currentIterationNumber;
  }

  public void setCurrentIterationNumber(Integer currentIterationNumber) {
    this.currentIterationNumber = currentIterationNumber;
  }

  public Boolean getEnableFollowing() {
    return enableFollowing;
  }

  public void setEnableFollowing(Boolean enableFollowing) {
    this.enableFollowing = enableFollowing;
  }

  public class TimeZone {

    private String kind;
    private String olsonName;
    private String offset;

    public String getKind() {
      return kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }

    public String getOlsonName() {
      return olsonName;
    }

    public void setOlsonName(String olsonName) {
      this.olsonName = olsonName;
    }

    public String getOffset() {
      return offset;
    }

    public void setOffset(String offset) {
      this.offset = offset;
    }
  }
}
