package com.cicd.projecta.domain.thirdparty.CircleCI;

import java.util.List;

public class Build {

  private Object compare;
  private PreviousSuccessfulBuild previousSuccessfulBuild;
  private BuildParameters buildParameters;
  private Boolean oss;
  private Boolean allCommitDetailsTruncated;
  private String committerDate;
  private String body;
  private String usageQueuedAt;
  private List<Object> contextIds = null;
  private String failReason;
  private Object retryOf;
  private String reponame;
  private List<Object> sshUsers = null;
  private String buildUrl;
  private Integer parallel;
  private Boolean failed;
  private String branch;
  private String username;
  private String authorDate;
  private String why;
  private User user;
  private String vcsRevision;
  private Workflows workflows;
  private Object vcsTag;
  private Integer buildNum;
  private Boolean infrastructureFail;
  private String committerEmail;
  private Boolean hasArtifacts;
  private Previous previous;
  private String status;
  private String committerName;
  private Object retries;
  private String subject;
  private String vcsType;
  private Boolean timedout;
  private Object dontBuild;
  private String lifecycle;
  private Boolean noDependencyCache;
  private String stopTime;
  private Boolean sshDisabled;
  private Integer buildTimeMillis;
  private Picard picard;
  private CircleYml circleYml;
  private List<Object> messages = null;
  private Boolean isFirstGreenBuild;
  private Object jobName;
  private String startTime;
  private Object canceler;
  private List<AllCommitDetail> allCommitDetails = null;
  private String platform;
  private String outcome;
  private String vcsUrl;
  private String authorName;
  private Object node;
  private String queuedAt;
  private Boolean canceled;
  private String authorEmail;

  public Object getCompare() {
    return compare;
  }

  public void setCompare(Object compare) {
    this.compare = compare;
  }

  public PreviousSuccessfulBuild getPreviousSuccessfulBuild() {
    return previousSuccessfulBuild;
  }

  public void setPreviousSuccessfulBuild(PreviousSuccessfulBuild previousSuccessfulBuild) {
    this.previousSuccessfulBuild = previousSuccessfulBuild;
  }

  public BuildParameters getBuildParameters() {
    return buildParameters;
  }

  public void setBuildParameters(BuildParameters buildParameters) {
    this.buildParameters = buildParameters;
  }

  public Boolean getOss() {
    return oss;
  }

  public void setOss(Boolean oss) {
    this.oss = oss;
  }

  public Boolean getAllCommitDetailsTruncated() {
    return allCommitDetailsTruncated;
  }

  public void setAllCommitDetailsTruncated(Boolean allCommitDetailsTruncated) {
    this.allCommitDetailsTruncated = allCommitDetailsTruncated;
  }

  public String getCommitterDate() {
    return committerDate;
  }

  public void setCommitterDate(String committerDate) {
    this.committerDate = committerDate;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getUsageQueuedAt() {
    return usageQueuedAt;
  }

  public void setUsageQueuedAt(String usageQueuedAt) {
    this.usageQueuedAt = usageQueuedAt;
  }

  public List<Object> getContextIds() {
    return contextIds;
  }

  public void setContextIds(List<Object> contextIds) {
    this.contextIds = contextIds;
  }

  public String getFailReason() {
    return failReason;
  }

  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }

  public Object getRetryOf() {
    return retryOf;
  }

  public void setRetryOf(Object retryOf) {
    this.retryOf = retryOf;
  }

  public String getReponame() {
    return reponame;
  }

  public void setReponame(String reponame) {
    this.reponame = reponame;
  }

  public List<Object> getSshUsers() {
    return sshUsers;
  }

  public void setSshUsers(List<Object> sshUsers) {
    this.sshUsers = sshUsers;
  }

  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }

  public Integer getParallel() {
    return parallel;
  }

  public void setParallel(Integer parallel) {
    this.parallel = parallel;
  }

  public Boolean getFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getAuthorDate() {
    return authorDate;
  }

  public void setAuthorDate(String authorDate) {
    this.authorDate = authorDate;
  }

  public String getWhy() {
    return why;
  }

  public void setWhy(String why) {
    this.why = why;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getVcsRevision() {
    return vcsRevision;
  }

  public void setVcsRevision(String vcsRevision) {
    this.vcsRevision = vcsRevision;
  }

  public Workflows getWorkflows() {
    return workflows;
  }

  public void setWorkflows(Workflows workflows) {
    this.workflows = workflows;
  }

  public Object getVcsTag() {
    return vcsTag;
  }

  public void setVcsTag(Object vcsTag) {
    this.vcsTag = vcsTag;
  }

  public Integer getBuildNum() {
    return buildNum;
  }

  public void setBuildNum(Integer buildNum) {
    this.buildNum = buildNum;
  }

  public Boolean getInfrastructureFail() {
    return infrastructureFail;
  }

  public void setInfrastructureFail(Boolean infrastructureFail) {
    this.infrastructureFail = infrastructureFail;
  }

  public String getCommitterEmail() {
    return committerEmail;
  }

  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = committerEmail;
  }

  public Boolean getHasArtifacts() {
    return hasArtifacts;
  }

  public void setHasArtifacts(Boolean hasArtifacts) {
    this.hasArtifacts = hasArtifacts;
  }

  public Previous getPrevious() {
    return previous;
  }

  public void setPrevious(Previous previous) {
    this.previous = previous;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCommitterName() {
    return committerName;
  }

  public void setCommitterName(String committerName) {
    this.committerName = committerName;
  }

  public Object getRetries() {
    return retries;
  }

  public void setRetries(Object retries) {
    this.retries = retries;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }

  public Boolean getTimedout() {
    return timedout;
  }

  public void setTimedout(Boolean timedout) {
    this.timedout = timedout;
  }

  public Object getDontBuild() {
    return dontBuild;
  }

  public void setDontBuild(Object dontBuild) {
    this.dontBuild = dontBuild;
  }

  public String getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
  }

  public Boolean getNoDependencyCache() {
    return noDependencyCache;
  }

  public void setNoDependencyCache(Boolean noDependencyCache) {
    this.noDependencyCache = noDependencyCache;
  }

  public String getStopTime() {
    return stopTime;
  }

  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  public Boolean getSshDisabled() {
    return sshDisabled;
  }

  public void setSshDisabled(Boolean sshDisabled) {
    this.sshDisabled = sshDisabled;
  }

  public Integer getBuildTimeMillis() {
    return buildTimeMillis;
  }

  public void setBuildTimeMillis(Integer buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
  }

  public Picard getPicard() {
    return picard;
  }

  public void setPicard(Picard picard) {
    this.picard = picard;
  }

  public CircleYml getCircleYml() {
    return circleYml;
  }

  public void setCircleYml(CircleYml circleYml) {
    this.circleYml = circleYml;
  }

  public List<Object> getMessages() {
    return messages;
  }

  public void setMessages(List<Object> messages) {
    this.messages = messages;
  }

  public Boolean getIsFirstGreenBuild() {
    return isFirstGreenBuild;
  }

  public void setIsFirstGreenBuild(Boolean isFirstGreenBuild) {
    this.isFirstGreenBuild = isFirstGreenBuild;
  }

  public Object getJobName() {
    return jobName;
  }

  public void setJobName(Object jobName) {
    this.jobName = jobName;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Object getCanceler() {
    return canceler;
  }

  public void setCanceler(Object canceler) {
    this.canceler = canceler;
  }

  public List<AllCommitDetail> getAllCommitDetails() {
    return allCommitDetails;
  }

  public void setAllCommitDetails(List<AllCommitDetail> allCommitDetails) {
    this.allCommitDetails = allCommitDetails;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public String getVcsUrl() {
    return vcsUrl;
  }

  public void setVcsUrl(String vcsUrl) {
    this.vcsUrl = vcsUrl;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Object getNode() {
    return node;
  }

  public void setNode(Object node) {
    this.node = node;
  }

  public String getQueuedAt() {
    return queuedAt;
  }

  public void setQueuedAt(String queuedAt) {
    this.queuedAt = queuedAt;
  }

  public Boolean getCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }


  public class Picard {

    private BuildAgent buildAgent;
    private ResourceClass resourceClass;
    private String executor;

    public BuildAgent getBuildAgent() {
      return buildAgent;
    }

    public void setBuildAgent(BuildAgent buildAgent) {
      this.buildAgent = buildAgent;
    }

    public ResourceClass getResourceClass() {
      return resourceClass;
    }

    public void setResourceClass(ResourceClass resourceClass) {
      this.resourceClass = resourceClass;
    }

    public String getExecutor() {
      return executor;
    }

    public void setExecutor(String executor) {
      this.executor = executor;
    }

  }

  public class Previous {

    private Integer buildNum;
    private String status;
    private Integer buildTimeMillis;

    public Integer getBuildNum() {
      return buildNum;
    }

    public void setBuildNum(Integer buildNum) {
      this.buildNum = buildNum;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public Integer getBuildTimeMillis() {
      return buildTimeMillis;
    }

    public void setBuildTimeMillis(Integer buildTimeMillis) {
      this.buildTimeMillis = buildTimeMillis;
    }


  }

  public class PreviousSuccessfulBuild {

    private Integer buildNum;
    private String status;
    private Integer buildTimeMillis;

    public Integer getBuildNum() {
      return buildNum;
    }

    public void setBuildNum(Integer buildNum) {
      this.buildNum = buildNum;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public Integer getBuildTimeMillis() {
      return buildTimeMillis;
    }

    public void setBuildTimeMillis(Integer buildTimeMillis) {
      this.buildTimeMillis = buildTimeMillis;
    }

  }

  public class Properties {

    private String buildAgent;
    private String executor;

    public String getBuildAgent() {
      return buildAgent;
    }

    public void setBuildAgent(String buildAgent) {
      this.buildAgent = buildAgent;
    }

    public String getExecutor() {
      return executor;
    }

    public void setExecutor(String executor) {
      this.executor = executor;
    }

  }

  public class ResourceClass {

    private Double cpu;
    private Integer ram;
    private String _class;


    public Double getCpu() {
      return cpu;
    }

    public void setCpu(Double cpu) {
      this.cpu = cpu;
    }

    public Integer getRam() {
      return ram;
    }

    public void setRam(Integer ram) {
      this.ram = ram;
    }

    public String getClass_() {
      return _class;
    }

    public void setClass_(String _class) {
      this._class = _class;
    }

  }

  public class UpstreamConcurrencyMap {


  }

  public class User {

    private Boolean isUser;
    private String login;
    private String avatarUrl;
    private Object name;
    private String vcsType;
    private Integer id;


    public Boolean getIsUser() {
      return isUser;
    }

    public void setIsUser(Boolean isUser) {
      this.isUser = isUser;
    }

    public String getLogin() {
      return login;
    }

    public void setLogin(String login) {
      this.login = login;
    }

    public String getAvatarUrl() {
      return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
    }

    public Object getName() {
      return name;
    }

    public void setName(Object name) {
      this.name = name;
    }

    public String getVcsType() {
      return vcsType;
    }

    public void setVcsType(String vcsType) {
      this.vcsType = vcsType;
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

  }

  public class Workflows {

    private String jobName;
    private String jobId;
    private String workflowId;
    private String workspaceId;
    private List<Object> upstreamJobIds = null;
    private UpstreamConcurrencyMap upstreamConcurrencyMap;
    private String workflowName;


    public String getJobName() {
      return jobName;
    }

    public void setJobName(String jobName) {
      this.jobName = jobName;
    }

    public String getJobId() {
      return jobId;
    }

    public void setJobId(String jobId) {
      this.jobId = jobId;
    }

    public String getWorkflowId() {
      return workflowId;
    }

    public void setWorkflowId(String workflowId) {
      this.workflowId = workflowId;
    }

    public String getWorkspaceId() {
      return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
      this.workspaceId = workspaceId;
    }

    public List<Object> getUpstreamJobIds() {
      return upstreamJobIds;
    }

    public void setUpstreamJobIds(List<Object> upstreamJobIds) {
      this.upstreamJobIds = upstreamJobIds;
    }

    public UpstreamConcurrencyMap getUpstreamConcurrencyMap() {
      return upstreamConcurrencyMap;
    }

    public void setUpstreamConcurrencyMap(UpstreamConcurrencyMap upstreamConcurrencyMap) {
      this.upstreamConcurrencyMap = upstreamConcurrencyMap;
    }

    public String getWorkflowName() {
      return workflowName;
    }

    public void setWorkflowName(String workflowName) {
      this.workflowName = workflowName;
    }

  }

  public class AllCommitDetail {

    private String committerDate;
    private String body;
    private String branch;
    private String authorDate;
    private String committerEmail;
    private String commit;
    private String committerLogin;
    private String committerName;
    private String subject;
    private String commitUrl;
    private String authorLogin;
    private String authorName;
    private String authorEmail;


    public String getCommitterDate() {
      return committerDate;
    }

    public void setCommitterDate(String committerDate) {
      this.committerDate = committerDate;
    }

    public String getBody() {
      return body;
    }

    public void setBody(String body) {
      this.body = body;
    }

    public String getBranch() {
      return branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }

    public String getAuthorDate() {
      return authorDate;
    }

    public void setAuthorDate(String authorDate) {
      this.authorDate = authorDate;
    }

    public String getCommitterEmail() {
      return committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
      this.committerEmail = committerEmail;
    }

    public String getCommit() {
      return commit;
    }

    public void setCommit(String commit) {
      this.commit = commit;
    }

    public String getCommitterLogin() {
      return committerLogin;
    }

    public void setCommitterLogin(String committerLogin) {
      this.committerLogin = committerLogin;
    }

    public String getCommitterName() {
      return committerName;
    }

    public void setCommitterName(String committerName) {
      this.committerName = committerName;
    }

    public String getSubject() {
      return subject;
    }

    public void setSubject(String subject) {
      this.subject = subject;
    }

    public String getCommitUrl() {
      return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
      this.commitUrl = commitUrl;
    }

    public String getAuthorLogin() {
      return authorLogin;
    }

    public void setAuthorLogin(String authorLogin) {
      this.authorLogin = authorLogin;
    }

    public String getAuthorName() {
      return authorName;
    }

    public void setAuthorName(String authorName) {
      this.authorName = authorName;
    }

    public String getAuthorEmail() {
      return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
      this.authorEmail = authorEmail;
    }

  }

  public class BuildAgent {

    private String image;
    private Properties properties;

    public String getImage() {
      return image;
    }

    public void setImage(String image) {
      this.image = image;
    }

    public Properties getProperties() {
      return properties;
    }

    public void setProperties(Properties properties) {
      this.properties = properties;
    }

  }

  public class BuildParameters {

    private String cIRCLEJOB;


    public String getCIRCLEJOB() {
      return cIRCLEJOB;
    }

    public void setCIRCLEJOB(String cIRCLEJOB) {
      this.cIRCLEJOB = cIRCLEJOB;
    }

  }


  public class CircleYml {

    private String string;


    public String getString() {
      return string;
    }

    public void setString(String string) {
      this.string = string;
    }

  }


}
